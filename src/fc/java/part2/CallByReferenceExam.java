package fc.java.part2;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        int result=addArray(a);
        System.out.println("result = " + result);
    }

    public static int addArray(int[] x) {
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum=sum+x[i];
        }
        return sum;
    }
}
