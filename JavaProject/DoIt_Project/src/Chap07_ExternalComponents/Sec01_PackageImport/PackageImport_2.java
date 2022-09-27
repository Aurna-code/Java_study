// 외부 패키지의 클래스 사용 방법 2(임포트 구문 사용) 실습
package Chap07_ExternalComponents.Sec01_PackageImport;

// Sec01_PackageImport.common 패키지 내의 A 클래스를 임포트
import Chap07_ExternalComponents.Sec01_PackageImport.common.A;

public class PackageImport_2 {
	public static void main(String[] args) {
		// 객체 생성
		A a = new A();
		
		// 멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}

}
