// pattern matching and list
val list4 = List(0,1,2);
val pattern = list4 match {
    case Nil => "Empty"
    case h :: t => s"Head: $h, Tail: $t"
};

println(pattern);

// addOne function using pattern matching
def addOne(l: List[Int]) : List[Int] = l match {
    case Nil => Nil
    case h :: t => h + 1 :: addOne(t)
}

println(addOne(List(1,2)) == List(2,3)) // true

// For more generality, first class function can be used.
def map(l: List[Int], f: Int => Int): List[Int] =
    l match {
        case Nil => Nil
        case h :: t => f(h) :: map(t,f)
    }

println({def f(x: Int) = x + 1; map(List(1,2),f)});
// anonymous first class function
println(map(List(1,2), x => x+1));

// Using underscore to write anonoymous first class function
val f: (Int, Int)=>Int = {_ + _}
println(f(1,2));
