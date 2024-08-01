package Inherit

class Student(name:String,age:Int,gender:String,var studentId:Int):Person(name,age,gender){

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gernder: $gender")
        println("Student ID: $studentId")
    }
}