package ex01;

import java.util.Scanner;

public class t06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오. ");
		int money = scanner.nextInt();
		
		int oman = money / 50000;
		int man = (money % 50000) / 10000;
		int choen = (money % 10000) / 1000;
		int bak = (money % 1000) / 100;
		int osip = (money % 100) / 50;
		int sip = (money % 50) / 10;
		int il = (money % 10) / 1;
		
		System.out.println("오만원권 "+oman+"매");
		System.out.println("만원권 "+man+"매");
		System.out.println("천원권 "+choen+"매");
		System.out.println("백원권 "+bak+"개");
		System.out.println("오십원 "+osip+"개");
		System.out.println("십원 "+sip+"개");
		System.out.println("일원 "+il+"개");
		
		scanner.close();
	}

}
