package library.repository;

import java.util.ArrayList;
import library.model.Book;

//Salvar livro livros.json <- salvar o arraylist em um arquivo

public class BookRepository {
    //ArrayList of Books
    private ArrayList<Book> books = new ArrayList<>();

    public boolean isEmpty(){
        return books.isEmpty();
    }

    //Add Book
    public void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
        System.out.println("Book added: " + title);
    }

    //Search for Book by Id
    public Book searchBook(int id){
        for(Book b : books){
            if(b.getId() == id)
                return b;
        }
        return null;
    }

    //Incomplete
    public void removeBook(Book book){
        books.remove(book);
    }

    //Book Listing
    public void listBooks() {
        for(Book book : books){
            System.out.println("Id: " + book.getId() + "| Title: " + book.getTitle() + "| Author: " + book.getAuthor());
        }
    }
}
