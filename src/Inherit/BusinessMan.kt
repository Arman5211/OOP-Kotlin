package Inherit

class BusinessMan(name:String,age:Int,gender:String,var businessincome:Int ):Person(name,age,gender){

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gerder: $gender")
        println("Businessincome: $businessincome")
    }
}