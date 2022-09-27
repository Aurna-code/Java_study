package Chap08.sec01_accessmodifier.Ex02_AccessModifierOfClass_1;

public class AccessModifierOfClass_1 {
	public static void main(String[] args) {
		// 객체 생성
	A a = new A();	// 같은 패키지에서는 public 클래스와 default 클래스의
	B b = new B();  // 타입 모두 객체를 선언할 수 있으며, public 생성자와
	C c = new C();	// default 생성자 모두 호출 가능
	}

}
