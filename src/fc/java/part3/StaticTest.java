package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum = StaticTest.hap(a,b);
        System.out.println("sum = " + sum);

    }
    //매개변수로 2개 정수 입력 받아 총합 구해 리턴
    public static int hap(int a, int b){
        int v=a+b;
        return v;
    }
}
