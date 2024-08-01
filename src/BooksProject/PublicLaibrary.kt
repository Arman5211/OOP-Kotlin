package BooksProject

class PublicLaibrary: Laibrary(){
    private val books = mutableListOf<Book>()
    override fun addBook(book: Book) {
        books.add(book)

    }
    override fun viewAllBook() {
        for (book in books){
            println("Title: ${book.title}")
            println("Auther: ${book.auther}")
            println("year: ${book.year}")
        }
    }

    override fun findBookByAuther(author: String) {
        for (book in books)
            if (book.auther == author) {
                println("Title: ${book.title}")
                println("Auther: ${book.auther}")
                println("year: ${book.year}")
            }
    }
}