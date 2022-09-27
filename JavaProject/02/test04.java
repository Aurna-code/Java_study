
import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("저장할 정수의 개수를 입력해 주십시오. >> ");
		int num = input.nextInt();
		for(int i = 0; i<5; i++)
			for(int j = 0; j <num; j++)
				System.out.print((int)(Math.random()*100 + 1) + "\t");
		System.out.println();
		input.close();
			}
	}

