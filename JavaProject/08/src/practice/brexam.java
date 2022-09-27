package practise;
import java.util.Scanner;
public class brexam {
	public static void main(String[] args) {
		Scanner input = new Scanner(Systme.in);
		
		System.out.println("input exit");
		while(true) {
			System.out.println(" >> ");
			String text = input.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다.");
		
	}

}
