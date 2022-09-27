package chapter07;

public class dfaewr {
	public static void main(String[] args) {
		
	String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
	String name;
	int age;
	name = str.substring(7,10);
    age = str.indexOf("동") + str.lastIndexOf("[홍");
    System.out.println(name);
    System.out.println(age);
		    
}
}
