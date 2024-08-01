package BooksProject

abstract class Laibrary {
    abstract fun addBook(book: Book)
    abstract fun viewAllBook()
    abstract fun findBookByAuther (author: String)
}