package fc.java.part2;

public class BookTest {
    public static void main(String[] args) {
        //정수 한개를 저장할 변수 선언
        int a;
        a=10;
        System.out.println("a = " + a);
        //한권의 책 데이터를 저장하고 출력
        String title = "자바";
        int price = 30000;
        String company = "출판사";
        String author = "김가네";
        int page = 700;
        String isbn = "ISBN-111990011";
        System.out.println(title + "\t" + price + "\t" + company+"\t"+ author+"\t"+page+"\t"+isbn);     // \t = 탭키
        //책 한권 저장할 변수
        Book b;

    }
}
