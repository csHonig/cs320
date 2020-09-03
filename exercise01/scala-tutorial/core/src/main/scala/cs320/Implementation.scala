package cs320

object Implementation extends Template with Assignment {

  def volumeOfCuboid(a: Int, b: Int, c: Int): Int = a * b * c

  def concat(x: String, y: String): String = x + y

  def addN(n: Int): Int => Int = {
    def add(m: Int): Int = m+n
    add
  }

  def twice(f: Int => Int): Int => Int = {
    def ret(num: Int): Int = f(f(num))
    ret
  }

  def compose(f: Int => Int, g: Int => Int): Int => Int = {
    def ret(num: Int): Int = f(g(num))
    ret
  }

  def double(l: List[Int]): List[Int] = {
    if (l.isEmpty) Nil
    else{
      val first: Int = l.head
      (first*2) :: double(l.drop(1))
    }
  }

  def sum(l: List[Int]): Int = {
    if (l.isEmpty) 0
    else {
      val first = l.head
      first + sum(l.drop(1))
    }
  }

  def getKey(m: Map[String, Int], s: String): Int = {
    if (m.contains(s)) m(s)
    else error(s)
  }

  def countLeaves(t: Tree): Int = {
    t match{
      case Leaf(_) => 1
      case Branch(left, _, right) => countLeaves(left) + countLeaves(right)
    }
  }

  def flatten(t: Tree): List[Int] = {
    t match{
      case Leaf(value) => (value :: Nil)
      case Branch(left, value, right) => flatten(left) ::: (value :: Nil) ::: flatten(right)
    }
  }
}
