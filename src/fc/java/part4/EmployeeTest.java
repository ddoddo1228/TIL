package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // 사원 한명 객체 생성하고 데이터 저장 후 출력
        RempVO vo = new RempVO("홍길동", 500, "010-1111-1111","2024-01-21", "홍보부", false);


        //System.out.println(vo.name + "\t" + vo.age + "\t" + vo.phone + "\t" + vo.empDate + "\t" + vo.dept + "\t" + vo.marriage);
        System.out.println(vo.toString());
    }
}