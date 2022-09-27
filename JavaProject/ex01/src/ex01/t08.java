package ex01;

import java.util.Scanner;

public class t08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점 (x, y)의 좌표를 입력하시오>>");
		int xdot = scanner.nextInt();
		int ydot = scanner.nextInt();
		
		if (xdot >= 100) {
			if (xdot <= 200) {
				if (ydot >= 100) {
					if (ydot <= 200) {
						System.out.println("(" + xdot + "," + ydot + ")는 사각형 안에 있습니다.");
					}
				}
			}
		}
					else {
						System.out.println("(" + xdot + "," + ydot + ")는 사각형 안에 없습니다.");
					}
		scanner.close();
	}
}
