package library.model;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private boolean borrowed;

    //Constructor
    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        borrowed = false;
    }

    //Getters
    public int getId(){
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean getBorrowed(){
        return borrowed;
    }

    //Setter
    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }
}
