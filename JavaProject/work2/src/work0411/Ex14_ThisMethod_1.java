
// this() 메소드의 문법적 특징과 의미 실습
package work0411;

// 클래스 정의
class A7 {
	A7() {
		System.out.println("첫 번째 생성자");
	}
	
	A7(int a) {
		this(); 	// this() 메서드는 반드시 생성자의 첫 줄에 위치해야 함.
		System.out.println("두 번째 생성자");
	}
	/*
	void abc() {
		this();		// 메서드에는 this() 메서드 사용 불가능
	}
	*/
}

public class Ex14_ThisMethod_1 {
	public static void main(String[] args) {
		// 객체 생성
		A7 a1 = new A7();			// 첫 번째 생성자 호출
		System.out.println();
		A7 a2 = new A7(3);
	}

}
