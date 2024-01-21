package fc.java.part2;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");

        int max1 = maxValue(7, 9);
        System.out.println("max1 = " + max1);

        int max2 = maxValue(3, 8);
        System.out.println("max2 = " + max2);
    }

    public static int maxValue(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int minValue(int a, int b) {
        return (a < b) ? a : b;
    }
}
