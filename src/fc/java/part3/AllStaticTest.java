package fc.java.part3;
import fc.java.model.AllStatic;
public class AllStaticTest {
    public static void main(String[] args) {
        AllStaticTest st = new AllStaticTest();
        System.out.println(AllStatic.hap(10, 20));
        System.out.println(AllStatic.hap(10, 20));
        System.out.println(AllStatic.hap(10, 20));

        System.out.println(Math.max(30, 60));
        System.out.println(Math.max(40, 10));
    }

}
