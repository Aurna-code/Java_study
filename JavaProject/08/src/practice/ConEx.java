package practise;

import java.util.Scanner;

public class ConEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수5개 입력");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int n = input.nextInt();
			if(n<=0)
				continue;
			else
				sum += n;
		}
		System.out.println("양수합은" + sum);
	}

}
