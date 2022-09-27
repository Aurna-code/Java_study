package ex01;

import java.util.Scanner;

public class t07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하시오.");
		int tri1 = scanner.nextInt();
		int tri2 = scanner.nextInt();
		int tri3 = scanner.nextInt();
		
		if (tri1 + tri2 > tri3) {
			if (tri2 + tri3 > tri1) {
				if (tri1 + tri3 > tri2) {
					System.out.println("삼각형이 됩니다.");
				}
			}
		}
				else 
					System.out.println("삼각형이 안 됩니다.");
				
		scanner.close();
	}

}
