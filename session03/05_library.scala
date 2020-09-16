val l = List(0,1,2,3,4,5);

println(l.map(_ + 1));
println(l.filter(_ % 2 == 0))
println(l.foldLeft[List[Int]](Nil)((i,h) => h::i))