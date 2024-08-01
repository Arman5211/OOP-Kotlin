package NestedClass

class Outer {
    var name:String = "Arman"
    class Nasted{
        var outer = Outer()

        fun display(){
            println(outer.name)
        }
    }
}
fun main (){
    val out = Outer()
    val nested = Outer.Nasted()
    nested.display()
}
