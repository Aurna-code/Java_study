
// 인터페이스 구현 및 디폴트 메서드의 오버라이딩 실습
package Chap11.sec02_interface.Ex06_DefaultMethod_1;

interface A {
	void abc();
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	}
}

class B implements A {
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}
class C implements A {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	}
}


public class DefaultMethod_1 {
	public static void main(String[] args) {
		// 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		//메서드 호출
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
	}

}
