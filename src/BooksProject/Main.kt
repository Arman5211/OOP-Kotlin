package BooksProject

import BooksProject.PublicLaibrary

fun main(args: Array<String>) {

    val publicLaibrary = PublicLaibrary()

    publicLaibrary.addBook(Book("The NoteBook","F.Tamim",1998))
    publicLaibrary.addBook(Book("Joy Bangla","Sabbir",1990))
    publicLaibrary.addBook(Book("The Force","Kawsar",2002))

    println("************* All BOOKS***************")
    println("")
    publicLaibrary.viewAllBook()

    println("*************** Find BOOKS By Auther***************")
    publicLaibrary.findBookByAuther("Kawsar")

}