
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int big, small; 
		int GCM, LCM; 
		int mok, na; 
		
		System.out.print("첫번째 수 입력 >> "); 
		int first = input.nextInt(); 
		System.out.print("두번째 수 입력 >> "); 
		int second = input.nextInt(); 
		
		if(first >= second) { 
			big = first; small = second; 
			}
		else { 
			big = second; small = first; 
			} 
		
		while(true) { mok = big/small; 
		na = big-mok*small; 
		if(na==0) { 
			GCM = small; 
		LCM = (first*second)/GCM; 
		
		System.out.println("최대공약수: "+GCM); 
		System.out.println("최소공배수: "+LCM); break; 
		} 
		big = small; small = na; 
		} 
		} 
	}

		
		