import java.util.Scanner;

public class Credit {
	public static void main(String[] args) {
		int[] credit = new int[10];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("학생 10명의 성적을 입력하세요 : ");
			credit[i] = input.nextInt();
		}
		for(int i=0; i<credit.length; i++) {
			for(int j=i+1; j<credit.length; j++) {
				if (credit[i]>credit[j]) {
					int point = credit[i];
							credit[i] = credit[j];
							credit[j] = point;
					}
			}
		}
		for(int i=0; i<credit.length; i++) {
			System.out.print(credit[i] + " ");
		}
		System.out.print("\nF "+ " D "+ " D+ "+"C "+ " C+"+ " B "+ " B+ "+ "A "+ " A+" +" A+");
		input.close();
	}
}