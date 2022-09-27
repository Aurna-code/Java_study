//  묵시적 this 키워드 자동 추가 실습
package work0411;

// 클래스 내부에서 필드, 메서드에 앞에 자동으로 붙는 this 키워드

class A5 {
	int m;
	int n;
	
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;		// this.를 생략했을 때 자동으로 추가
		this.n = b;		// this.를 생략했을 때 자동으로 추가
	}
	void work() {
		this.init(2, 3);
	}
}
public class Ex12_ThisKeyword_1 {
	public static void main(String[] args) {
		// 클래스 객체 생성
		A5 a5 = new A5();
		// 메서드 호출 / 필드값 활용
		a5.work();
		System.out.println(a5.m);
		System.out.println(a5.n);
	}

}ㅊ