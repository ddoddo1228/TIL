package fc.java.part4;
import fc.java.poly.*;
public class ObjectPolyArray {
    public static void main(String[] args) {
        Object[] obj=new Object[2];
        obj[0] = new A();
        obj[1] = new B();
        display(obj);
        /* for(int i=0; i<obj.length;i++){

            if(obj[i] instanceof A){
                ((A) obj[i]).printGo();
            }else{
                ((B) obj[i]).printGo();
            }
        } */
    }
    private static void display(Object[] obj){

    }
}
