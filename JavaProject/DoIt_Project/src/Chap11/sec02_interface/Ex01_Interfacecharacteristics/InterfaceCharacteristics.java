
// 인터페이스 내 필드 및 메서드의 제어자 실습
package Chap11.sec02_interface.Ex01_Interfacecharacteristics;


interface A {
	public static final int a = 3;
	public abstract void abc();
}

interface B {
	int b = 3;		// 생략했을 때 자동으로 public static final
	void bcd();		// 생략했을 때 자동으로 public abstract
	
	
}
public class InterfaceCharacteristics {
	public static void main(String[] args) {
		// static 자동 추가 확인
		System.out.println(A.a);
		System.out.println(B.b);
		
		// final 자동 추가 확ㅇㄴ
		// A.a = 5; 		// 불가능
		// B.b = 5; 		// 불가능
	}

}
