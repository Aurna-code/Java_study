import java.util.Scanner;

public class GameEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("<<가위, 바위, 보 게임>> \n 1)가위, 2)바위, 3)보 \n 선택하세요 : ");
		String user;
		user = input.next();
		
		int random = (int)(Math.random()*3+1);
		System.out.print(random);
		
		if((user == "가위" && random == 1) || (user == "바위" && random == 2) || (user == "보" && random == 3)) {
			System.out.print("비겼습니다. \n 1)다시 하기 , 2)게임종료");	
		}
		else if((user == "가위" && random == 2) || (user == "바위" && random == 3) || (user == "보" && random == 1)) {
			System.out.print("당신이 졌습니다. \n 1)다시 하기 , 2)게임종료");
		}
		else if ((user == "가위" && random == 3) || (user == "바위" && random == 1) || (user == "보" && random == 2)) {
			System.out.print("당신이 이겼습니다. \n 1)다시 하기 , 2)게임종료");
		}
		else 
			System.out.print("올바르지 않은 값입니다.");
		input.close();
	}
}
