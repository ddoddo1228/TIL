package fc.java.part2;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        int x=-10;
        if(x>0){
            System.out.println("양수입니다.");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요.: ");
        int num = scan.nextInt();
        if(num%7==0){
            System.out.println("num = " + num + "은 7의 배수입니다.");
        }
        //나이 입력해서 19이상이면 성인임을 출력
        System.out.println("나이를 입력하세요.: ");
        int age = scan.nextInt();
        if(age>=19){
            System.out.println("성인입니다.");
        }
        System.out.println("종료");
    }
}
