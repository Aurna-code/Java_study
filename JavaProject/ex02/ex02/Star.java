package ex02;

public class Star {
	public static void main(String[] args) {
		for(int k=0; k<5; k++) {	
			for(int i=0; i<9; i++) {
				if(k==4 || i==4-k || i==4+k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
				System.out.print("\n");
		}
	}
}
