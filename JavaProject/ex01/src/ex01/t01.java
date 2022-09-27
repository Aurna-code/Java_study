package ex01;

import java.util.Scanner;

public class t01 {
	public static void main (String[] args) {
		
		System.out.print("이름을 입력하세요. ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println(name + " 씨, 안녕하세요?");
		System.out.println("JAVA에 오신 것을 환영합니다.");
		
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int firstnum = scanner.nextInt();
		
		System.out.print("두 번째 정수를 입력하시오 : ");
		int secondnum = scanner.nextInt();
		
		int result = firstnum + secondnum;
				
		System.out.print(firstnum + " 과 " + secondnum + " 의 합은 " + result + " 입니다.");
		
		scanner.close();
		
	}

}