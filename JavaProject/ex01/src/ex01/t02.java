package ex01;

import java.util.Scanner;

public class t02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("분자를 입력하시오 : ");
		int son = scanner.nextInt();
		
		System.out.print("분모를 입력하시오 : ");
		int mom = scanner.nextInt();
		
		int quo = son / mom;
		int left = son % mom;
		
		System.out.println("나눗셈의 몫 : " + quo );
		System.out.println("나눗셈의 나머지 : " + left);
		
		scanner.close();
		
	}
	
}
