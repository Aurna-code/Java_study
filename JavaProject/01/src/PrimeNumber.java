
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 양의 정수를 입력하십시오.");
		int a = input.nextInt();
		System.out.print("두 번째 양의 정수를 입력하십시오.");
		int b = input.nextInt();
		
		for(int i=a; i<=b; i++) {
			for(int j=2; j<=b; j++) {
				if(i%j==0 && i !=j)
					break; 
					if (i ==j ) {
					int PrimeArray[] = new int[i];
					i += PrimeArray[i];
					System.out.print("두 정수 사이의 소수는 " + PrimeArray.length +"개 입니다.");
				}
			}
		}
		input.close();
	}
	}
