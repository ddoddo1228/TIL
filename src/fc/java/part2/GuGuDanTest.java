package fc.java.part2;

public class GuGuDanTest {
    public static void main(String[] args) {
        for (int i=2; i<9;i++){
            System.out.println(i+"단"+"\t\t");
        }
        System.out.println();
            for(int i=1;i<=1;i++){
                for(int j=2; j<9;j++){
                    System.out.println(j+"X"+i+"="+(j*i)+"\t");
                }
            }
            for(int i=2;i<=2;i++) {
                for (int j = 2; j < 9; j++) {
                    System.out.println(j + "X" + i + "=" + (j * i) + "\t");
                }
                System.out.println();
            }
    }
}
