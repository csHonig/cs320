// Filtering only even integers
def even(l: List[Int]) : List[Int] = l match {
    case Nil => Nil
    case h :: t => if (h%2==0) h :: even(t) else even(t)
}
println(even(List(0,1,2)) == List(0,2)) // true

// Filter with first class function
def filter(l : List[Int], f: Int=>Boolean): List[Int] = 
    l match {
        case Nil => Nil
        case h::t => if (f(h)) h::filter(t, f) else filter(t, f)
    }

println(filter(List(-1,3,-2,5,-4), _>0) == List(3,5)) // ture