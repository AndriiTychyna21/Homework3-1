import Book.Book;
import ComputerNetwork.Computer;
import MailAddress.Address;
import Rectangle.Rectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 2
        Rectangle rectangle = new Rectangle(5, 2);
        double area = rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2());                     //The task says that these methods should have 2 double parameters
        double perimeter = rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2());           //(although I would do without parameters)
        System.out.println("Rectangle parameters\narea: " + area + "\nperimeter: " + perimeter + "\n");

        //Task 3
        Book myBook = new Book("Harry Potter and the Philosopher`s Stone", "J. K. Rowling", "The story of the boy who survived");
        myBook.show();
        System.out.println();

        //Task 4
        Computer[] Computers = new Computer[5];
        Scanner scan = new Scanner(System.in);
        String ip;
        for (int i = 0; i < Computers.length; i++){
            System.out.println("Enter the IP-address of the PC:");
            ip = scan.nextLine();
            Computers[i] = new Computer(ip);
        }
        System.out.println("Computers in the network:");
        for (int i = 0; i < Computers.length; i++){
            System.out.println((i+1) + " PC: " + Computers[i].getIp());
        }
        System.out.println();

        //Task 5
        Address sherlock = new Address();
        sherlock.setIndex("WC2N 5DU");
        sherlock.setCountry("United Kingdom");
        sherlock.setCity("London");
        sherlock.setStreet("Baker Street");
        sherlock.setHouse("221B");
        sherlock.setApartment(0);
        System.out.println(sherlock);
    }
}