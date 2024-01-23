package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPACITY=5; //수정불가(final)=>상수
    private Book[] elements;
    public int size=0;
    //생성동작
    public BookArray(){
        elements=new Book[DEFAULT_CAPACITY];

    }
    //저장하는 동작
    public void add(Book element){
        if(size==elements.length){
            //크기 2배 늘리는 작업
            ensureCapacity();
        }
        elements[size++]=element;
    }
    //얻는 동작
    public Book get(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("index의 범위(0~9)가 초과됨");
        }
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
