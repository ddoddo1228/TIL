package fc.java.course2.part1;

import fc.java.model2.Book;
import fc.java.model2.BookArray;
public class MyBookArrayTest {
    public static void main(String[] args) {
        BookArray list = new BookArray();
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

        // vo = list.get(0);
        System.out.println(list.get(0)); //-1하면 index의 범위 (0~9)가 초과된다는거 뜸
        //vo = list.get(1);
        System.out.println(list.get(1));
        //vo = list.get(2);
        System.out.println(list.get(2));
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
