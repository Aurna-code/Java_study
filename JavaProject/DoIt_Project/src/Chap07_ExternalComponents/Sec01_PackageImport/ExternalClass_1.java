
// 1개의 소스 파일에 외부 클래스 구성
package Chap07_ExternalComponents.Sec01_PackageImport;

class A {
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println(m + ", " + n);
	}
}

public class ExternalClass_1 {
	public static void main(String[] args) {
		// public 여부와 관계없이 같은 패키지 내에서는 객체의 생성 및 활용 가능
		A a = new A();
		a.print();
	}

}
