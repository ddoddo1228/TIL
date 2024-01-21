package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] std = new Student[4];
        std[0] = new Student("홍길동", "컴공", 33, "bit@empas.com", 2023110, "010-2222-2222");
        std[1] = new Student("이길동", "솦웨", 13, "bit@empas.com", 2023111, "010-2232-2222");
        std[2] = new Student("오길동", "건축", 23, "bit@empas.com", 2023112, "010-2322-2222");
        std[3] = new Student("김길동", "통신", 43, "bit@empas.com", 2023113, "010-2233-2222");
        for(int i=0;i<std.length; i++)
        {
            System.out.println(std[i].toString());
        }
        for(Student st  : std){
            System.out.println(st.toString());
        }

    }
}
