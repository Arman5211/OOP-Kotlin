package Inherit

import Class.Teacher
import javax.security.auth.Subject

class Teacher(name:String,age:Int,gender:String,var teacherid:Int,var subject: String):Person(name,age,gender){

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gerder: $gender")
        println("TeacherID: $teacherid")
        println("Subject: $subject")
    }
}