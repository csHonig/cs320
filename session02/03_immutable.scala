/* Variables defined by val are immutable.
   The code below raises an error (reassignment to val)

  val x = 1
  x = 2

  To define mutable variables, use var. */

var x = 1
x = 2
println(x)

/* List */
val y = List(x)       // immutable
val y = ListBuffer(x) // mutable

/* However, immutability is important!
- Immutable things are easier to reason about.
- Mutable onjects require defensive copies before passing. */

