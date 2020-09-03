def add(x: Int, y:Int): Int = x+y

/* Using function as an expression of another function */
def addSquared1(x: Int, y: Int): Int = add(x*x, y*y)

/* Defining local variables */
def addSquared2(x: Int, y: Int): Int = {
    val xSquared = x * x
    val ySquared = y * y
    add(xSquared, ySquared)
}

/* Defining local functions */
def addSquared3(x: Int, y: Int): Int = {
    def square(x: Int): Int = x * x
    add(square(x), square(y))
}

/* Omit return type annotations */
def add2(x: Int, y: Int) = x + y

/* However, you can't omit function parameter type annotations
   def add(x,y) = x + y
   error: ':' expected but ',' found */

println(add(1,2)) // 3
println(addSquared1(2,3))   // 13
println(addSquared2(2,3))   // 13
println(addSquared3(2,3))   // 13
println(add2(1,2)) // 3