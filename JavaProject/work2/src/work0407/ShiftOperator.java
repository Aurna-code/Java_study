package work0407;

//산술 쉬프트와 논리 시프트 실습

public class ShiftOperator {
	public static void main(String[] args) {
		//#1. 산술쉬프트(부호변화가 없음 *2, /2 효과)
		//@ << Left Shift
		System.out.println(3<<1); 
		System.out.println(-3<<1);
		System.out.println(3<<2);
		System.out.println(-3<<2);
		System.out.println();
		
		//@ >> Right shift
		System.out.println(5>>1);
		System.out.println(-5>>1);
		System.out.println(5>>2);
		System.out.println(-5>>2);
		System.out.println();
		
		//#2. 논리시프트 (>>>)
		System.out.println(3>>>1); // 0000...0011 =1
		System.out.println(-3>>>31); // 1111...1101 = 1
	}

}
