package Examples;
import java.util.ArrayList;

public class Main {
    //This set of examples contains the topics of Encapsulation,Constructor with using overloading,Some Class basics and methods with using overriding.


    public static void main(String []args){
        System.out.println("----------------------------------------------------------------------");
        Cat();
        System.out.println("----------------------------------------------------------------------");
        OverloadConstructor();
        System.out.println("----------------------------------------------------------------------");
        Classroom();
        System.out.println("----------------------------------------------------------------------");
        Person_class();
        System.out.println("----------------------------------------------------------------------");
        Rectangle(3,4);
        System.out.println("----------------------------------------------------------------------");
        Dog("Herkul","Golden");
        System.out.println("----------------------------------------------------------------------");
        Books();
        System.out.println("----------------------------------------------------------------------");

    }
    public static void Cat(){
        Cat cat = new Cat();
        System.out.println(cat);
        cat.setAge(5);
        cat.setName("Herkul");
        System.out.println(cat);
        Cat cat2 = new Cat(cat.getName()+"2", cat.getAge()+5);
        System.out.println(cat2);

    }
    public static void OverloadConstructor(){
        OverloadingBooks books1 = new OverloadingBooks();
        OverloadingBooks books2= new OverloadingBooks("Peace","Harry");
        OverloadingBooks books3= new OverloadingBooks("Sword","Clark",12);
        System.out.println(books1);
        System.out.println(books2);
        System.out.println(books3);

    }
    public static void Classroom(){
        String []students = {"James","Harry","Jackson"};
        Classroom classroom = new Classroom("Math-Class",students);
        System.out.println(classroom);
    }
    public static void Person_class(){
        Person person = new Person("James",22);
        System.out.println("Your name is " + person.getName() + " Your age is " + person.getAge());
        person.setName("Jack");
        person.setAge(24);
        System.out.println("Your name is " + person.getName() + " Your age is " + person.getAge());
    }
    public static void Rectangle(int height, int width){
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("The rectangle height -> " + rectangle.getHeight() + "\nThe rectangle width -> " + rectangle.getWidth());
        System.out.println("The rectangle area -> " + rectangle.Area(height, width));
        System.out.println("The rectangle perimeters -> " + rectangle.Perimeter(height, width));
        System.out.println("----------------------------------------------------------------------");
        rectangle.setHeight(5);
        rectangle.setWidth(12);
        System.out.println("The rectangle new height -> " + rectangle.getHeight() + "\nThe rectangle new width -> " + rectangle.getWidth());
        System.out.println("The rectangle new area -> " + rectangle.Area(rectangle.getHeight(), rectangle.getWidth()));
        System.out.println("The rectangle new perimeters -> " + rectangle.Perimeter(rectangle.getHeight(), rectangle.getWidth()));

    }
    public static void Dog(String name,String breed){
        Dog dog = new Dog(name,breed);
        System.out.println(dog.getName() + " " + dog.getBreed());
        dog.setName("Zeus");
        dog.setBreed("German-shepherd");
        System.out.println(dog.getName() + " " + dog.getBreed());
    }
    public static void Books(){
        Book book1 = new Book("The Java Programming Language", "Freeman", "978212531101630");
        Book book2 = new Book("An Introduction to Java", "Gordon", "9352156623489");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book> bookcollection = Book.getBookcollection();
        for(Book book : bookcollection){
            System.out.println(book.getAuthor() + " " + book.getTitle() + " " + book.getISBN());
        }
        System.out.println();
        Book.removeBook(book2);
        for(Book book : bookcollection){
            System.out.println(book.getAuthor() + " " + book.getTitle() + " " + book.getISBN());
        }
    }
}