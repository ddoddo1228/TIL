package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        float f1 = .10f;
        System.out.println("f1 = " + f1);
        float f2 = 15f;
        System.out.println("f2 = " + f2);
        float f3 = 3.14f;
        System.out.println("f3 = " + f3);
        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        float x = 15.6f;
        int y=(int)x;       //강제 형변환(손실 발생) float 에서 int는 byte는 4로 같지만 손실 발생
        System.out.println("y = " + y);
        char c = 'A';
        int cc = c;         //자동 형변환,  (int)안해도 됨
        System.out.println("cc = " + cc);

        int dd=  5;
        double ddd= dd;     //자동 형변환
        System.out.println("ddd = " + ddd);

        double dx = 14.67;
        int dy = (int)dx;           //강제 형변환 , 큰 바이트가 작은 바이트로 안 됨
        System.out.println("dy = " + dy);
    }
}
