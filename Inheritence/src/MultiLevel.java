//parent class
public class MultiLevel {
    // variable num1 and num2 is declared as protected
    protected double num1, num2;
    // method sum() is declared which shows the sum of num1 and num2
    void sum() {
        System.out.println("Sum = " + (num1 + num2));
    }
}
    // child class of class MultiLevel
class Sub extends MultiLevel {
    // method sub() is declared which shows the subtraction of num1 and num2
    void sub() {
        System.out.println("Subtraction = " + (num1 - num2));
    }
}
    // child class of class Sub from this multi level inheritance is started
class Mul extends Sub {
    // method mul() is declared which shows the multiplication of num1 and num2
    void mul() {
        System.out.println("Multiplication = " + (num1 * num2));
    }
}
    // child class of class Mul
class Div extends Mul {
    // method div() is declared which shows the division of num1 and num2
    void div() {
        System.out.println("Division = " + (num1 / num2));
    }
}
