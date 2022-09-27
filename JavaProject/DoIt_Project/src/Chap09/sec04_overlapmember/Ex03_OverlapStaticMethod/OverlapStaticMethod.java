
// 정적 메서드 중복
package Chap09.sec04_overlapmember.Ex03_OverlapStaticMethod;

class A {
	static void print() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	static void print() {
		System.out.println("B 클래스");
	}
}

public class OverlapStaticMethod {
	public static void main(String[] args) {
		// 클래스 명으로 바로 접근
		A.print();
		B.print();
		System.out.println();
		
		//객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new A();
		
		//객체를 통한 메서드 호출
		aa.print();
		bb.print();
		ab.print();
	}
}
