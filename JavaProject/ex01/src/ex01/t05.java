package ex01;

import java.util.Scanner;

public class t05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원) ");		
		int money = scanner.nextInt();
		
		double buck = money / 1200d;
		System.out.println(money + "원 은 $" + buck + "입니다.");
			
		scanner.close();
	}
}
