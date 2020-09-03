/* Loop with **mutable variables** */
def factorial1(n: Int): Int = {
    var m = n
    var res = 1
    while (m > 1){
        res *= m
        m -= 1
    }
    res
}

/* Therefore in functional programming, loops are USELESS.
   Replace loop with recursive function. */
def factorial2(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n-1)
}