package fc.java.part4;
import fc.java.poly.A;
public class ObjectTest {
    public static void main(String[] args) {
        A a= new A();
        a.display();
        Object obj = new A(); //업캐스팅
        ((A)obj).display();  //다운캐스팅
    }
}
