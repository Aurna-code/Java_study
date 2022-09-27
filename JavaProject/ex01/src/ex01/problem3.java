package ex01;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오. " );
		int num = scanner.nextInt();
		String re = (num%2 == 0)?"짝수 입니다.":"홀수 입입니다.";
		System.out.println(re);
		
		scanner.close();
	}

}
