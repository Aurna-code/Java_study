
// 멤버 및 생성자에 적용되는 4가지  접근 지정자
package Chap08.sec01_accessmodifier.Ex01_AccessModifierOfmember.pack1; // pack1 패키지 사용

public class A {
	// public부터 private까지 4가지의 서로 다른 접근 지정자를 포함하고 있는 필드 선언
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;
	
	// 같은 클래스 내의 멤버인 print() 메서드 내부에서는 모든 접근 지정자에 접근 가능
	public void print() {
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d);
		System.out.println();
	}

}
