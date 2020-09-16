def reverse(l: List[Int]) : List[Int] = {
    // remaining part l, pending part i
    def aux (l:List[Int], i:List[Int]) : List[Int] =
        l match {
            case Nil => i
            case h :: t => aux(t, h :: i)
        }
    aux(l, Nil)
}

println(reverse(List(1,2,3)) == List(3,2,1)) //true

def sum(l: List[Int]): Int = {
    def aux(l: List[Int], i: Int): Int = 
        l match {
            case Nil => i
            case h :: t => aux(t, i + h)
        }
    aux(l, 0)
}

println(sum(List(1,2,3)) == 6) // true

/*
def foldLeft(l: List[Int], x: ?, f: (?, Int) => ?): ? = {
    def aux(l: List[Int], i: ?): ? = l match {
        case Nil => i
        case h :: t => aux(t, f(h,i))
    }
    aux(l,x)
}
*/