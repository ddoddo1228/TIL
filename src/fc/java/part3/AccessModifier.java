package fc.java.part3;

import fc.java.model.Member1DTO;

public class AccessModifier {
    public static void main(String[] args) {
        Member1DTO dto = new Member1DTO();
        dto.name = "홍길동";
        //dto.age = 1000; //에러발생 (접근불가)
        dto.phone="010-2222-2222";
        System.out.println(dto.name+"\t"+dto.phone);
        dto.play();
    }
}
