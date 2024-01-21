package fc.java.part3;
import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1;
        Student st2;
        Student st3;


        st1 = new Student("홍길동", "컴퓨터공학부", 37, "bit@empas.com", 2023110, "010-1111-2222");
        st2 = new Student("김길동", "컴퓨터공학부", 27, "bit@empas.com", 2023111, "010-2222-1111");
        st3 = new Student("이길동", "컴퓨터공학부", 17, "bit@empas.com", 2023112, "010-2112-1221");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
