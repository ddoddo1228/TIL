package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;    //기본 소수 type을 double로 인식하니까 f추가
        boolean b=false;
        char c='A';
        String s="APPLE";
        //69를 10, 2, 8, 16진수로 출력
        int decimal=69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101;
        int octal = 0105;
        System.out.println("octal = " + octal);
        int hexa = 0x45;
        System.out.println("hexa = " + hexa);

    }
}
