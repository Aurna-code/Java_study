
// 인터페이스 상속 자식 클래스의 접근 지정자 실습
package Chap11.sec02_interface.Ex03_inheritanceOfInterface_2;


interface A {
	public abstract void abc();
}

interface B {
	void bcd();		// public abstract 추가
}

class C implements A {
	public void abc() {
}
}
	
/* public -> default 불가능
class D implements B {
	void bcd() {
	}
	}
 */

public class InheritanceOfInterface_2 {
	public static void main(String[] args) {
		
	}
}


