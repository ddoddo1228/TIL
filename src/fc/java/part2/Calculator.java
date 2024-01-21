package fc.java.part2;

//클래스 단위로 코딩을 해야함
public class Calculator {   //클래스(객체)를 만든 것
    //main(){ }메서드
    public static void main(String[] args) {        //동작, 처리를 하기 위해서는 메서드가 필요. main 바꾸면 안 됨 - 바꾸면 시작 클래스가 아니다. 그래서 run 버튼이 왼쪽에 안 뜸
        //두 개의 정수를 더하여 출력하는 자바 프로그램 만들기
        int a, b, c;
        a=1;
        b=1;
        c = a + b;
        System.out.println(c);   //sout입력하면 inteliJ에서 첫 번째에 제공함
    }
}
