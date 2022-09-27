package work0411;

//클래스 외부에서의 메서드 호출 실습

//클래스 정의
class A2 {
	//리턴 타입 void, 입력 매개변수 없음
	void print() {
		System.out.println("안녕");
		
	}
	
	//리턴 타입 int, 입력 매개변수 없음
		int data() {
			return 3;
		}		
	
	//리턴 타입 double, 입력 매개변수 2개
	double sum(int a, double b) {
		return a + b;
	}
	
	// 리턴 타입 void, 내부에 리턴 포함(함수를 종료함)
	void printMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m + "월입니다.");
	}
	
}


public class Ex03_ExternalCallMethods {
	public static void main(String[] args) {
		// 객체 생성
		A2 a = new A2();
		// 메서드 호출(멤버 활용)
		a.print();
		int k = a.data();
		a.data();
		System.out.println(k);
		double result = a.sum(9, 5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);
	}

}
