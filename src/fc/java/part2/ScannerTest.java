package fc.java.part2;

import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요.: ");
        int num=scan.nextInt(); //정수 하나를 읽기 위해
        System.out.println("scan = " + scan);

        System.out.println("실수를 입력하세요.: ");
        float f=scan.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자를 입력하세요.: ");
        String str =scan.next();
        System.out.println("str = " + str);

        scan.nextLine(); //버퍼 비우기(스트림 비우기)

        System.out.println("문자를 입력하세요.: ");
        String str1 =scan.nextLine();
        System.out.println("str1 = " + str1);

        scan.close();
    }
}
