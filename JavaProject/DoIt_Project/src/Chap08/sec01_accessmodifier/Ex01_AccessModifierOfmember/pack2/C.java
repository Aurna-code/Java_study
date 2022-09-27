package Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack2;
// A.java와 다른 pack2 패키지 사용

import Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack1.A;
// pack1의 클래스 A 임포트

public class C {
	public void print() {
		// 객체 생성
	A a = new A();	// 다른 클래스의 인스턴스 멤버를 사용하기 위해 객체 생성
	
	// 멤버 활용
	System.out.println(a.a + " ");
	// 다른 패키지 내의 클래스에서는 자식 클래스가 아닐 때는 public 접근 지정자만 사용 가능
	// System.out.print(a.b + " ");
	//System.out.println(a.c + " ");
	// System.out.println(a.d + " ");
	System.out.println();
	}

}
