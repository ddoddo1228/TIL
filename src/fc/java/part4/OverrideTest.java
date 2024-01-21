package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Dog;
import fc.java.poly.Cat;
public class OverrideTest {
    public static void main(String[] args) {
        //Upcasting
        Animal ani = new Dog();
        ani.eat(); // Animal ---(동적바인딩)---> Dog
        ani = new Cat();
        ani.eat();// Animal ---(동적바인딩)---> Cat
    }
}
