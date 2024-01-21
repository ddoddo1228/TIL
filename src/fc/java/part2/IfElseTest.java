package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x=10;
        if(x>=0){
            System.out.println("0 or 양수입니다.");
        }
        else{
            System.out.println("음수입니다.");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요.: ");
        int su = scan.nextInt();
        if (su%12==0){
            System.out.println("12의 배수 입니다.");
        }
        else {
            System.out.println("12의 배수가 아닙니다.");
        }
        //년도를 입력받아 윤년인지 아닌지 판별
        //윤년: 4의 배수인 년도 이거나 400의 배수인 년도
        System.out.println("년도를 입력하세요.: ");
        int year = scan.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("윤년입니다.");
        }
        else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
