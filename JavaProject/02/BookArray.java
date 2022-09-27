import java.util.Scanner;

class Book3 {
	String title, author;
	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book3 [] book = new Book3[2]; 	// Book 배열 선언
				
		Scanner input = new Scanner(System.in);
		for (int i=0; i<book.length; i++) {
			System.out.print("제목 >> "); 
			String title = input.nextLine();
			System.out.print("저자 >> ");
			String author = input.nextLine();
			book[i] = new Book3(title, author); //배열 원소 객체 생성
		}
		
	for(int i=0; i<book.length; i++)
		System.out.print("(" + book[i].title + "," + book[i].author + ")");
	
	input.close();
	}
}
