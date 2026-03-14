package library.main;
import java.util.Scanner;

import library.exception.BookAlreadyBorrowed;
import library.exception.BookNotFoundException;

//Salvar livro livros.json

//LivroNaoEncontradoException
//LivroJaEmprestadoException

//Try e Catch

//Mexer no Id, gerar ele automaticamente

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                    addBook();
                    break;
                case 2:
                    listBook();
                    break;
                case 3:
                    borrowBook();
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
    public static void addBook(){
        
    }
    public static void listBook(){
        
    }
    public static void borrowBook(){
        try{

        } catch(BookAlreadyBorrowed e){

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
