
import java.util.Scanner;

public class PrimeNumberAns {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("소수판정을 위한 첫 번째 양의 정수를 입력하십시오. >> ");
		int one = input.nextInt();
		System.out.print("소수판정을 위한 두 번째 양의 정수를 입력하십시오. >> ");
		int two = input.nextInt();
		
		int big, small;
		
		if(one == two) {
			System.out.print("올바르지 않은 입력입니다.");
			return;    //메인 함수를 종료시킴
		}
		else if(one > two) {
			big = one;
			small = two;
		}
		else {
			big = two;
			small = one;
		}
		
		boolean[] pn = new boolean[big]; // 배열 생성
		for(int i=0; i<pn.length; i++)
			pn[i] = true;				 // 초기화
		pn[0] = pn[1] = false;
		
		int count = 0;
		for(int i=0; i<pn.length; i++) {
			if(pn[i] ==true) {
				if(small < i)
				System.out.print(i + "\t"); 
				count++;
				if(count%10 == 0)
					System.out.println();
				for(int j=i*2; j<pn.length; j*=2) {
					pn[j] = false;
				}
			}
			for(int j=0; j<pn.length; j++) {
				
			}
		}
	}

}
