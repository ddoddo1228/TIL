package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        //도서정보 입력받기
        Scanner scan = new Scanner(System.in);
        System.out.println("제목: ");
        String title=scan.nextLine();
        System.out.println("title = " + title);

        System.out.println("가격: ");
        String price=scan.nextLine();
        System.out.println("price = " + price);



        System.out.println("출판사: ");
        String company=scan.nextLine();
        System.out.println("company = " + company);

        System.out.println("저자: ");
        String author =scan.nextLine();
        System.out.println("author = " + author );

        System.out.println("페이지: ");
        String page =scan.nextLine();
        System.out.println("page = " + page );

        System.out.println("ISBN: ");
        String isbn =scan.nextLine();
        System.out.println("isbn = " + isbn );
    }
}
