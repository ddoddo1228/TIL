package fc.java.part2;

public class OverLoadingTest {
    public static void main(String[] args) {
        float v = add(35.6f, 56.7f);
        System.out.println("v = " + v);
        int vv = add(10, 50);
        System.out.println("vv = " + vv);
    }

    public static float add(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
