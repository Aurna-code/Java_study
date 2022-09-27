package ex01;

import java.util.Scanner;

public class t10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("달을 입력하세요 >> ");
		int month = scanner.nextInt();
		String wol = "잘못 입력하였습니다";
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			 wol = "봄";
			 break;
		case 6:
		case 7:
		case 8:
			wol = "여름";
			break;
		case 9:
		case 10:
		case 11:
			wol = "가을";
			break;
		case 12:
		case 1:
		case 2:
			wol = "겨울";
			break;
		}
			System.out.println(wol);
		
		scanner.close();
		}
	}

