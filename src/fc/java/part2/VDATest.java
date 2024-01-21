package fc.java.part2;

public class VDATest {
    public static void main(String[] args) {
        //정수를 한개 저장하기 위해 변수 선언하기
        int v;
        v=10;
        System.out.println("v = "+v);
        int a=10;
        int b=a;
        int c=b*10;
        System.out.println("c = " + c); //soutv 하면 바로 위 코드 출력
        //sum에 1~5를 누적해서 출력
        int sum=0;    //sum은 지역변수 -> =0으로 초기화 안하면 오류 남
        sum = sum+1;
        sum = sum+2;
        sum = sum+3;
        sum = sum+4;
        sum = sum+5;
        System.out.println("sum = " + sum);
        //x=10, y=20저장하고 변수 값 서로 교환 //swap
        int x=10;
        int y=20;
        System.out.println("x="+x+":"+"y="+y);
        int tmp;
        tmp=y;
        y=x;
        x=tmp;
        System.out.println("x="+x+":"+"y="+y);

    }
}
