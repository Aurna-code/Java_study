package Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember;

// 서로 다른 패키지에 있는 A, B, C, D 클래스 임포트
import Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack1.A;
import Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack1.B;
import Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack2.C;
import Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack2.D;

public class AccessModifierOfMember {
	public static void mian(String[] args) {
		// 클래스의 객체 생성 및 print() 메서드 호출
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
		
	}

}
