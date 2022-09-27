
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("다음은 출전자 10명의 번호입니다. \n35, 9, 8, 18, 98, 31, 58, 17, 76, 45");
		int[] num = {35, 9, 8, 18, 98, 31, 58, 17, 76, 45};
		System.out.print("출전자 중 준성의 번호를 입력해 주십시오. >> ");
		int zunsung = input.nextInt();
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if (num[i]>num[j]) {
					int anon = num[i];
							num[i] = num[j];
							num[j] = anon;	
				}
			}
			System.out.print(num[i] + " ");
		}
		for(int i=0; i<num.length; i++) {
			if(zunsung == num[i]) {
				int order = i+1;
				System.out.print( "\n" + order);
		}
		input.close();
	}
}
}
