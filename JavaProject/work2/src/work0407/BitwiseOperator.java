package work0407;

// 다양한 진법의 표현과 비트연산자 실습
public class BitwiseOperator {
	public static void main(String[] args) {
		//#0. 자바코드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		
		System.out.println(Integer.parseInt("1101", 2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("0D",16));
		System.out.println();
		
		//#1. 다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);
		System.out.println(015);
		System.out.println(0x0D);
		System.out.println();
		
		//#2. 비트연산자
		//@AND 비트연산자
		System.out.println(3 & 10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0A);
		System.out.println();
		
		//@OR 비트연산자
		System.out.println(3 | 10);
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x03 | 0x0A);
		System.out.println();
		
		//@XOR 비트연산자
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		System.out.println();
		
		//@NOT 비트연산자
		System.out.println(-3);
		System.out.println(-0b0011);
		System.out.println(-0x03);
		
	}

}
