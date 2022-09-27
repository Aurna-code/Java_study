package work0411;

//this(생성자 입력매개변수) 활용 실습

class A8 {
	int m1, m2, m3, m4;
	A8() {
		m1 =1 ;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	A8(int a) {
		m1 = a;
		m2 =2;
		m3 = 3;
		m4 = 4;
	}
	A8(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	// 클래스 A8의 모든 필드 값을 출력
	void print() {
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4);
		System.out.println();
	}
}

class B8 {
	int m1, m2, m3, m4;
	B8() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	B8(int a) {
		this();
		m1 = a;
	}
	B8(int a, int b) {
		this();		// B8() 생성자 호출
		m2 = b;
	}
	/* B8() 생성자를 호출하고, 두 필드 값을 한 번에 수정할 수도 있음.
	 B8(int a, int b) {
	 this();
	 m1 = a;
	 m2 = b;
	 }
	 */
	void print() {
		System.out.println(m1 + " ");
		System.out.println(m2 +" ");
		System.out.println(m3 + " ");
		System.out.println(m4);
		System.out.println();
	}
}

public class Ex15_ThisMethod_2 {
	public static void main(String[] args) {
		// 3가지 객체 생성(this() 미사용
		A8 a1 = new A8();
		A8 a2 = new A8(10);
		A8 a3 = new A8(10, 20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		// 3가지 객체 생성(this() 미사용
		B8 b1 = new B8();
		B8 b2 = new B8(10);
		B8 b3 = new B8(10, 20);
		b1.print();
		b2.print();
		b3.print();
	}

}
