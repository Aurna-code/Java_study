package ex02;

public class NestedLoop {
	public static void main(String[] args) {
		
		for(int k=2; k<10; k++) {
			System.out.print(k + "단\t");	//구구단 단수
			}
		System.out.println();
		
		for(int i=1; i<10; i++) {	
			for(int j=2; j<10; j++) {	//각 단의 구구셈 출력
				System.out.print(j + "*" + i + "=" + j*i);	//구구셈 출력
				System.out.print('\t');		//하나씩 탭으로 띄우기
			}
		System.out.println(); 	//한 단이 끝나면 다음 줄로 커서 이동
		}
	}
}