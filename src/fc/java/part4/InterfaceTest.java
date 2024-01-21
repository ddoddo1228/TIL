package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.TV;

public class InterfaceTest {

    public static void main(String[] args) {
        //다형성 100%보장
        //부모가 인터페이스면 자식의 내부 동작 방식 몰라도 동작 시킬 수 있음
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volup();
        remo.volDown();
        remo.internet();

        remo=new TV();
        remo.chUp();
        remo.chDown();
        remo.volup();
        remo.volDown();
        remo.internet();


    }
}
