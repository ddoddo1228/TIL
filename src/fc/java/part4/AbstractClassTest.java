package fc.java.part4;

import fc.java.poly.*;

public class AbstractClassTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani=new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
