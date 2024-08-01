package NestedAndInner

class Outer {
    var name:String = "Arman"
    inner class Inner{
        fun display(){
            println(name)
        }
    }
}

fun main(){
    val out = Outer()
    val inner = out.Inner()
    inner.display()

}