package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        //add라는 메서드를 호출(call)하여 두수의 합의 결과를 받기
        int result=add(a,b);
        System.out.println("result = " + result);
    }
    //매개변수로 2개의 정수를 받아 합을 구하여 리턴하는 메서드 정의
    public static int add(int a, int b) {  //반환형이 int니까 int ~하기
        int sum = a + b;
        return sum;
    }
}
