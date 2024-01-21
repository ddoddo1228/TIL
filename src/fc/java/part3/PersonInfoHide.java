package fc.java.part3;
import fc.java.model.PersonVO;
public class PersonInfoHide {
    //한 사람의 회원 정보를 저장할 객체
    public static void main(String[] args) {
            PersonVO vo = new PersonVO();
            vo.setName("홍길동");
            vo.setAge(50);
            vo.setPhone("010-2222-2222");
        //vo.name="홍길동";
        //vo.age = 50;
        //vo.phone = "010-2222-2222";
            System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
        //System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone);
        }
    }


