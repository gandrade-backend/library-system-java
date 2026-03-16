package library.main;
import java.util.Scanner;

import library.exception.BookAlreadyBorrowed;
import library.exception.BookNotFoundException;
import library.repository.BookRepository;
import library.service.LibraryService;

//Salvar livro livros.json

//testing

//Try e Catch

//Mexer no Id, gerar ele automaticamente

//Mexer lendBook, se nao tiver nenhum para emprestar

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookRepository repository = new BookRepository();
        LibraryService service = new LibraryService();

        int option;
        do{
            System.out.println("Library System");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    addBook(repository);
                    break;
                case 2:
                    listBook(repository);
                    break;
                case 3:
                    listBook(repository);
                    lendBook(service);
                    break;
                case 4:
                    removeBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    System.out.println("Finished Program");
                    break;
                default:
                    break;
            }
        }while(option != 6);

        scanner.close();
    }
    public static void addBook(BookRepository repository){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the book ID: ");
        int id = scanner.nextInt();
        System.out.print("\nWrite the name of the book: ");
        String name = scanner.nextLine();
        System.out.print("\nWrite the author's name: ");
        String author = scanner.nextLine();
        repository.addBook(id, name, author);

        scanner.close();
    }
    public static void listBook(BookRepository repository){
        if(!repository.isEmpty()) repository.listBooks();
        else System.out.println("The library is empty.");
    }
    public static void lendBook(LibraryService service){
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        try{
            service.lendBook(id);
        } catch(BookAlreadyBorrowed e){
            System.out.println(e.getMessage());
        }
    }
    public static void removeBook(){
        try{

        } catch(BookNotFoundException e){
            
        }
    }
    public static void returnBook(){
        try{

        } catch(BookNotFoundException e){
            
        }
    }
}
