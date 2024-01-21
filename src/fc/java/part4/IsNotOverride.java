package fc.java.part4;

import fc.java.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        //재정의를 안했기 때문에 -> 부모가 명령(메세지 보내면)을 내리면 오동작
        //다형성 보장x -> 다형성 보장하기 위해 재정의를 강제로 하도록 만듦
        //추상클래스, 인터페이스 등장
        //다형성이 보장 됨
        Animal ani = new Dog();
        ani.eat();

        ani=new Cat();
        ani.eat();
    }
}
