package ex01;

import java.util.Scanner;

public class t04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("화씨 온도 : ");
		int ther = scanner.nextInt();
		
		double ther2 = (ther-32)*5/9d;
		System.out.print("섭씨 온도 : " + ther2);
		
		scanner.close();
	}

}
