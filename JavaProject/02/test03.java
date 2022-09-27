
import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //  환산할 돈의 종류
		
		System.out.print("금액을 입력하시오. >>");
		int money = input.nextInt();
		System.out.println("50000원 짜리 " + money/unit[0] + "개");
		System.out.println("10000원 짜리 " + money%unit[0]/unit[1] + "개");
		System.out.println("1000원 짜리 " + money%unit[0]%unit[1]/unit[2] + "개");
		System.out.println("100원 짜리 " + money%unit[0]%unit[1]%unit[2]/unit[4] + "개");
		System.out.println("10원 짜리 " + money%unit[0]%unit[1]%unit[2]%unit[4]/unit[6] + "개");
		System.out.println("1원 짜리 " + money%unit[0]%unit[1]%unit[2]%unit[3]%unit[6]/unit[7] + "개");
		input.close();
	}
}
