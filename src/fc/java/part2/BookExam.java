package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        //정수 1개 저장할 변수
        int a;
        a=10;
        // 책 1권 저장할 변수
        //Book b;
        //b = new Book();
        //한권의 책 데이터를 저장하기 위해 객체 생성(인스턴스 생성)
        Book b = new Book();
        b.title ="자바";
        b.price=30000;
        b.company="출판사";
        b.author="김가네";
        b.page = 700;
        b.isbn="1199110";
        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn+"\t");
    }
}
