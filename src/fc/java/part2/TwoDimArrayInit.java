package fc.java.part2;

public class TwoDimArrayInit {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        char[][] b = new char[5][];
        b[0] = new char[1];
        b[1] = new char[2];
        b[2] = new char[3];
        b[3] = new char[4];
        b[4] = new char[5];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = '☆';
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
