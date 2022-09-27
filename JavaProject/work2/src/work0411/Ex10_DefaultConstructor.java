
// 기본 생성자의 자동 추가
package work0411;

class A3 {
	int m;
	void work() {
		System.out.println(m);
	}
	/* 생성자를 포함하지 않으면 컴파일러가 기본 생성자를 자동으로 추가한다.
	 A() {
	 }
	 */
}
class B {
	int m;
	void work() {
		System.out.println(m);
	}
	// 기본 생성자를 직접 정의
	B() {
		
	}
}
class C {
	int m;
	void work() {
		System.out.println(m);
	}
	// 입력매개변수를 포함하고 있는 생성자 정의
	C(int a) {
		m=a;	//입력매개변수로 전달된 겂으로 필드 값 초기화
	}
}

public class Ex10_DefaultConstructor {
	public static void main(String[] args) {
		//클래스 객체 생성
		A3 a3 = new A3();
		B b = new B();
		// C c = new C();
		C c = new C(3);
		
		// 메서드 호출
		a3.work();
		b.work();
		c.work();
	}

}
