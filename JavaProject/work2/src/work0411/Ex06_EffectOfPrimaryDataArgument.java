
// 기본 자료형 입력매개변수 값의 변화실습
package work0411;

public class Ex06_EffectOfPrimaryDataArgument {
	public static void main(String[] args) {
		int a = 3; // main() 함수의 지역변수 a
		int result1 = twice(3);
		System.out.println(result1);
		int result2 = twice(a);	// main() 함수의 지역변수 a
		System.out.println(result2);
		System.out.println(a);	// main()함수의 지역변수 a
	}
	
	public static int twice(int a) {	// twice() 메소드의 지역변수 a
		a = a * 2;						// twice() 메소드의 지역변수 a
		return a;						// twice() 메소드의 지역변수 a
	}

}
