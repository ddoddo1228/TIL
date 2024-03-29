package fc.java.part4;
import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class PolyTest {
    public static void main(String[] args) {
        //업캐스팅으로 객체 생성
        //상속관계, 재정의, 동적바인딩
        //다형성
        //상위클래스가 동일한 메세지로 하위클래스를 서로다르게 동작시키는 객체지향 원리

        Animal ani = new Dog();
        ani.eat();  // 실행시점에서 사용될(호출될)메서드가 결정되는 바인딩(동적 바인딩)

        ani=new Cat();
        ani.eat();
        //다운캐스팅
        ((Cat)ani).night();
        //오버로딩: 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와는 무관
        // Override(재정의) : 동적바인딩 = 실행시점에서 사용될(호출될) 메서드가 결정되는 바인딩
        // -> 프로그램의 실행속도와 관계 있음.
    }
}
