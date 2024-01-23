package fc.java.model2;

import java.util.Arrays;

public class IntArray {
    private final int DEFAULT_CAPACITY=5; //수정불가(final)=>상수
    private int[] elements;
    public int size=0;
    //생성동작
    public IntArray(){
        elements=new int[DEFAULT_CAPACITY];

    }
    //저장하는 동작
    public void add(int element){
        if(size==elements.length){
            //크기 2배 늘리는 작업
            ensureCapacity();
        }
        elements[size++]=element;
    }
    //얻는 동작
    public int get(int index){
        return elements[index];
    }
    public int size(){
        return size;
    }
    public void ensureCapacity(){
        int newCapacity=elements.length*2;
        elements=Arrays.copyOf(elements, newCapacity);
    }
}
