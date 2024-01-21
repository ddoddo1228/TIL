package fc.java.part2;

public class ArrayExam {
    public static void main(String[] args) {
        int a;
        a=10;

        //정수 3개 저장 변수
        int[] b = new int[3];
        b[0]=10;
        b[1]=20;
        b[2]=30;
        int[] x={1,2,3,4,5};
        for(int i=0; i<x.length;i++){
            System.out.println(x[i]);
        }
        char[] c={'A','P','P','L','E'};
        System.out.println((char)(c[0]+32));
        System.out.println((char)(c[1]+32));
        System.out.println((char)(c[2]+32));
        System.out.println((char)(c[3]+32));
        System.out.println((char)(c[4]+32));

        for (int i=0; i<c.length;i++){
            System.out.println((char)(c[i]+32));
        }
    }
}
