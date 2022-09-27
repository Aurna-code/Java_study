package work0411;

//클래스 생성
class Aa {
	int m = 3;	// 필드
	int n = 4;  // 필드
	void work1() {
		int k = 5;	//지역 변수
		System.out.println(k);
		work2(3);	//work2() 안에 정의된 지역 변수를 스택 메모리에 추가
	}
	void work2(int i) {
		int j = 4;
		System.out.println((i + 1));
	}
}

public class Ex01_FieldComponent {
	public static void main(String[] args) {
		// 클래스로 객체 생성
		Aa a = new Aa();
		System.out.println(a.m);
		System.out.println(a.n);
		// 메소드 호출
		a.work1();    // work1() 안에 정의된 지역 변수를 스택 메모리에 추가
	}

}
