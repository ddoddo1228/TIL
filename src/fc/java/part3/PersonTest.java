package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name="홍길동";
        p.age=30;
        p.phone = "010-1111-1111";
        System.out.println(p.name+"\t"+p.age+"\t"+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();
        Person p1 = new Person();
        p1.name="동동이";
        p1.age=34;
        p1.phone = "010-2222-2222";
        System.out.println(p1.name+"\t"+p1.age+"\t"+"\t"+p1.phone);
        p1.play();
        p1.eat();
        p1.walk();
    }
}
