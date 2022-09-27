package ex02;

public class Star2 {
	public static void main(String[] args) {
		for(int k=0; k<10; k++) {	
			for(int i=0; i<9; i++) {
				if(i==4-k || i==4+k || i==k-5 || i ==13 - k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
				System.out.print("\n");
		}
	}
}
