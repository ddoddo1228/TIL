package fc.java.part4;
import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani=new Cat();  //업캐스팅
        ani.eat();
        ((Cat)ani).night();    //다운캐스팅
    }
}
