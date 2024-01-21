package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }
    /* private static void display(Cat c){
        c.eat();
    }
    private static void display(Dog d){
        d.eat();
    } */

    private static void display(Animal ani) { //1. 다형성 인수
        ani.eat();
        if(ani instanceof Cat){
            ((Cat)ani).night();
        }

        //Cat타입으로 받은 경우에만 실행
        //((Cat)ani).night();
    }

}
