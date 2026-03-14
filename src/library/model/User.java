package library.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final int id;
    private final String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public List<Book> getBoorrowedBooks(){
        return borrowedBooks;
    }

    //Getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
