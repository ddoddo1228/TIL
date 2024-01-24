package fc.java.course2.part1;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        //ArrayList에 5개 정수 저장 출력
        //ArrayList -> object[] <--X-- int
        //ArrayList -> object[] <--X-- Integer(Wrapper)
        //ArrayList -> object[] <--(Auto-boxing:Integer)-- int
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //  int<-(Auto-unboxing)--Integer
        for(int data: list){
            System.out.println(data);
        }
    }
}
