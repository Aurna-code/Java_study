package ex01;

import java.util.Scanner;

public class t09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원의 중심과 반지름을 입력하시오");
		double cent1 = scanner.nextInt();
		double cent2 = scanner.nextInt();
		double rad = scanner. nextInt();
		
		System.out.println("점을 입력하시오");
		double dot1 = scanner.nextInt();
		double dot2 = scanner.nextInt();
		
		if (Math.sqrt((dot1 - cent1)*(dot1 - cent1) + (dot2 - cent2)*(dot2 - cent2)) <= rad) {
			System.out.println("점 (" + dot1 + "," + dot2 + ")는 원 안에 있습니다.");	
		}
		else 
			System.out.println("점 (" + dot1 + "," + dot2 + ")는 원 안에 없습니다.");
		
		scanner.close();	
	}
}
