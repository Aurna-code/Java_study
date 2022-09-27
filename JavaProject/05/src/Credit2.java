import java.util.Scanner;

public class Credit2 {
	public static void main(String[] args) {
		int[] credit = new int[10];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("학생 10명의 성적을 입력하세요 : ");
			credit[i] = input.nextInt();
		}
		for(int i=0; i<credit.length; i++) {
			int max = credit[i];
			boolean ismax = max > credit[i+1];
				if(ismax) {
					credit[i+2] = max;
					
			}
		System.out.print(credit[i]);
		
		}
		}
}