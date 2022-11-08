/*
Simple Inheritance
*/
//parent / Base class
public class A {
    // variable i is declared as protected
    protected int i;
    // method showi() is declared
    void showi() {
        System.out.println("i = " + i);
    }
}
//child / derived class of class A
class B extends A {
    // variable j is declared
    int j;
    // method showj() is declared
    void showj() {
        System.out.println("j = " + j);
    }
    // method sum() is declared which shows the sum of I and J
    void sum() {
        System.out.println("i + j = " + (i + j));
    }
}
