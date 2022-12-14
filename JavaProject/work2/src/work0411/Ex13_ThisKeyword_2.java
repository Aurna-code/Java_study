
// 명시적 this 키워드 추가
package work0411;

class A6 {
	int m;
	int n;
	
	void init(int m, int n) {
		m = m;
		n = n;
	}
}
class B6 {
	int m;
	int n;
	
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class Ex13_ThisKeyword_2 {
	public static void main(String[] args) {
		// 필드명과 지역 변수명이 같고, this 키워드를 사용하지 않은 경우
		A6 a6 = new A6();
		a6.init(2, 3);
		System.out.println(a6.m);
		System.out.println(a6.n);
		
		// 필드명과 지역 변수명이 같고, this 키워드를 사용한 경우
		B6 b6 = new B6();
		b6.init(2, 3);
		System.out.println(b6.m);
		System.out.println(b6.n);
	}
}
