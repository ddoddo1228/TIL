package fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private final int DEFAULT_CAPACITY=5; //수정불가(final)=>상수
    private Object[] elements;  //object는 최상위 클래스. 다형성배열
    public int size=0;
    //생성동작

    public ObjectArray(){
        this(5); // this(5) : 생성자 안에서 다른 생성자 호출할 때 사용

    }
    public ObjectArray(int capacity){
        elements=new Object[capacity];

    }
    //저장하는 동작
    public void add(Object element){    //다형성인수
        if(size==elements.length){
            //크기 2배 늘리는 작업
            ensureCapacity();
        }
        elements[size++]=element;
    }
    //얻는 동작
    public Object get(int index){
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
