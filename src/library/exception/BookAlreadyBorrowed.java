package library.exception;

public class BookAlreadyBorrowed extends RuntimeException{
    public BookAlreadyBorrowed(String message){
        super(message);
    }
}
