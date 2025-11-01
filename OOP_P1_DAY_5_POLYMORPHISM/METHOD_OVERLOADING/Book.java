package OOP_P1_DAY_5_POLYMORPHISM.METHOD_OVERLOADING;

//4. Overload constructor in `Book` class.

public class Book {
    private String name;
    private String authorname;
    private int  Year;

    public Book(){
        this.name = "Unknown Title";
        this.authorname = "authorname";
        this.Year = 0;
        System.out.println("default Booked.");
          
    }

    public Book(String name){
        this.name = name;
        this.authorname = "  No Author specification  ";
        this.Year = 0; 
        System.out.println("  Book Created with title  " + this.name);
    }

    public Book(String name, String authorname){
        this.name = name;
        this.authorname = authorname;
        this.Year = 0;
        System.out.println("Creating Book Title : " + this.name + "Auther Name : " + this.authorname );
    }

    public Book(String name, String authorname, int Year){
        this.name = name;
        this.authorname = authorname;
        this.Year = Year;
        System.out.println("Book Created All Details  : ");


    }

    public void display(){
        System.out.println(" Book Name : " + name + "   Auther Name          : " + "   Year of publish       : "+ Year);
    }

    public static void main(String[] args){
        System.out.println("-----Creating Book-----");

        Book b1 = new Book();

        Book b2 = new Book("Crime and Punishment           ");

        Book b3 = new Book("The Adventures of Tom Sawyer   ", "Mark Twain");

        Book b4 = new Book("Alice's Adventures in Wonderland",  "Lewis Carroll", 1865);


        b1.display();
        System.out.println("-------------------------------------------------------------------------------------------");
        b2.display();
        System.out.println("-------------------------------------------------------------------------------------------");
        
        b3.display();
        System.out.println("-------------------------------------------------------------------------------------------");
        
        b4.display();
    }
}
