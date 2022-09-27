//외부 패키지의 클래스 사용 방법 1(클래스의 풀네임 사용) 실습
package Chap07_ExternalComponents.Sec01_PackageImport;

public class PackageImport_1 {
	public static void main(String[] args) {
		// 객체 생성
		// Aa = new AQ; // 오류
		// 다른 패키지의 클래스를 사용할 때는 패키지명을 포함한 풀네임을 사용해야 한다.
		Chap07_ExternalComponents.Sec01_PackageImport.common.A a = new Chap07_ExternalComponents.Sec01_PackageImport.common.A();
		
		// 멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
	
}
