package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringTest {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동", 34, "010-2222-2222");
        // System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
        System.out.println(vo.toString());
        System.out.println(vo);  // vo.toString과 같음
        }
}
