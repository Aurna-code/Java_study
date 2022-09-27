
// 다양한 생성자를 사용한 다양한 객체 생성 방법 실습
package work0411;

class A4 {
	A4() {
		System.out.println("첫 번째 생성자");
	}
	A4(int a) {
		System.out.println("두 번째 생성자");
	}
	A4(int a, int b) {
		System.out.println("세 번째 생성자");
	}
}

public class Ex11_ConstructorOverloading {
	public static void main(String[] args) {
		A4 a = new A4();
		A4 b = new A4(3);
		A4 c = new A4(3, 5);
	}

}
