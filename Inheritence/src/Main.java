import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create an object of a child class
        B b = new B();
        //access the members of the parent class with the object of child class
        System.out.println("Enter the value of i: ");
        b.i = input.nextInt();
        //access the members of the child class with the object of child class
        System.out.println("Enter the value of J: ");
        b.j = input.nextInt(); /* we can access parent class members or methods using child class object
                    but we can't access child class members or methods using parent class object */
        //calling the methods
        b.showi();
        b.showj();
        b.sum();
        /*
        Now we are using Multi level inheritance in this program
         */
        //create an object of a last child class
        Div d = new Div();  /*
        we can access parent and parent of parent class members or methods using last child class object
        but we can't access child class members or methods using parent class object. conclusion is that
        we can access methods or members from down to up.
        */
        System.out.println("Enter the value of num1: ");
        //access the 1st parent class members using last child class objects and parsing
        d.num1 = input.nextDouble();
        System.out.println("Enter the value of num2: ");
        d.num2 = input.nextDouble();
        //calling the methods
        d.sum();
        d.sub();
        d.mul();
        d.div();
    }
}