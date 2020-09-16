package cs320

object Implementation extends Template {

  def freeIds(expr: Expr): Set[String] = {
    expr match {
      case Num(v) => Set()
      case Add(l, r) => freeIds(l) ++ freeIds(r)
      case Sub(l, r) => freeIds(l) ++ freeIds(r)
      case Id(i) => Set(i)
      case Val(n, e, b) => freeIds(e) ++ (freeIds(b) - n)
    }
  }

  def bindingIds(expr: Expr): Set[String] = {
    expr match {
      case Num(v) => Set()
      case Add(l,r) => bindingIds(l) ++ bindingIds(r)
      case Sub(l,r) => bindingIds(l) ++ bindingIds(r)
      case Id(i) => Set()
      case Val(n,e,b) => Set(n) ++ bindingIds(e) ++ bindingIds(b)
    }
  }

  def boundIds(expr: Expr): Set[String] = {
    def aux(e: Expr, bids: Set[String]): Set[String] = {
      e match {
        case Num(v) => Set()
        case Add(l,r) => aux(l, bids) ++ aux(r, bids)
        case Sub(l,r) => aux(l, bids) ++ aux(r, bids)
        case Id(i) => if (bids.contains(i)) Set(i) else Set()
        case Val(n, exp, b) => aux(exp, bids) ++ aux(b, bids + n)
      }
    }
    aux(expr, Set())
  }
}
