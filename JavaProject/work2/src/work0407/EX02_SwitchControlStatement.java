package work0407;

// switch 선택제어문(break 미포함, break 포함, if문 변환 실습
public class EX02_SwitchControlStatement {
	public static void main(String[] args) {
		// #1. break가 포함되지 않은 경우
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default :
			System.out.println("D");	
		} //BCD
		System.out.println();
		
		//#2. break가 포함된 경우
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B"); // 실행 후 탈출
			break;
		case 3:
			System.out.println("C"); // 실행 후 탈출
			break;
		default:
			System.out.println("D");
		} // B
		System.out.println();
		
		//@if - else if - else 구문으로 변환
		if(value1 == 1) {
			System.out.println("A");
		}
		else if(value1 == 2) {
			System.out.println("B"); // 실행 후 탈출
		}
		else if(value1 == 3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}
}
