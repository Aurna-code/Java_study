package chapter07;

public class test1 {
	public static void main(String[] args) {
		
		int[][] a = {{1,2},{3,4,5}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
			
		}
		System.out.println();
		for(int[]m : a) { // <- 주소값(행)
			for(int n: m) {  // <- 열값
				System.out.println(n);
			}
		}
		
		
	}

}
