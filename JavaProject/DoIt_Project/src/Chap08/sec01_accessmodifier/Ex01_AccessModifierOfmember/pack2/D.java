package Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack2;

import Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack1.A;

public class D extends A {	// D 클래스는 A 클래스의 자식 클래스
	public void print() {
		// 멤버 활용
		System.out.println(a + " ");
		System.out.println(b + " ");
		// 자식 클래스는 다른 패키지에 있어도 객체의 생성 없이 protected 접근 지정자 필드까지 접근 가능
		// System.out.println(c + " ");
		// System.out.println(d);
		System.out.println();
	}

}
