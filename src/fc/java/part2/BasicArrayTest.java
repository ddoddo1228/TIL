package fc.java.part2;

public class BasicArrayTest {
    public static void main(String[] args) {
        float[] f={24.5f, 45.6f, 77.65f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        Book[] b = new Book[3];
        b[0]=new Book();
        b[0].title="자바";
        b[0].price=30000;
        b[0].company="출판사";
        b[0].author="김가네";
        b[0].page=500;
        b[0].isbn="11889900";
        //System.out.println(b[0].title+"\t"+b[0].price+"\t"+b[0].company+"\t"+ b[0].author+"\t"+b[0].page+"\t"+b[0].isbn);
        b[1] = new Book();
        b[1]=new Book();
        b[1].title="오라클";
        b[1].price=30000;
        b[1].company="출판사";
        b[1].author="김가네";
        b[1].page=500;
        b[1].isbn="11800990";
        //System.out.println(b[1].title+"\t"+b[1].price+"\t"+b[1].company+"\t"+ b[1].author+"\t"+b[1].page+"\t"+b[1].isbn);
        b[2] = new Book();
        b[2]=new Book();
        b[2].title="파이썬";
        b[2].price=30000;
        b[2].company="출판사";
        b[2].author="김가네";
        b[2].page=500;
        b[2].isbn="11778890";
        //  System.out.println(b[2].title+"\t"+b[2].price+"\t"+b[2].company+"\t"+ b[2].author+"\t"+b[2].page+"\t"+b[2].isbn);
        for (int i=0; i<b.length; i++){
            System.out.println(b[i].title+"\t"+b[i].price+"\t"+b[i].company+"\t"+ b[i].author+"\t"+b[i].page+"\t"+b[i].isbn);
        }
    }
}
