package library.service;

import library.exception.BookAlreadyBorrowed;
import library.exception.BookNotFoundException;
import library.model.Book;
import library.repository.BookRepository;

public class LibraryService {
    private final BookRepository repository = new BookRepository();

    //method to search book
    public Book searchBook(int id) {
        Book book = repository.searchBook(id);
        if(book == null) {
            throw new BookNotFoundException("Book with id " + id + " not found");
        }
        return book;
    }

    //method to borrow book
    public void lendBook(int id){
        Book book = searchBook(id);
        if(book.getBorrowed()){
            throw new BookAlreadyBorrowed("Book with id " + id + " already borrowed");
        }
        System.out.println("Borrowed book");
        book.setBorrowed(true);
    }

    //incomplete
    public void returnBook(int id){
        Book book = searchBook(id);
        book.setBorrowed(false);
    }

    //method to remove book
    public void removeBook(int id) {
        Book book = searchBook(id);
        repository.removeBook(book);
    }
}
