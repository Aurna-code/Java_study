package work0407;

public class anything {
	public static void main(String[] args) {
		
	//#3. 증감연산자 @case2	
	int value3 = 3;
	int value4 = value3++;
	System.out.println(value3); //4
	System.out.println(value4); //3
	System.out.println();
	
	int value5 = 3;
	int value6 = ++value5;
	System.out.println(value5); //4
	System.out.println(value6); //4
	System.out.println();
	
	//#4. 증감연산자 @case3
	int value7 = 3;
	int value8 = 4;
	int value9 = 2 + value7-- + ++value8;
	System.out.println(value7); //2
	System.out.println(value8); //5
	System.out.println(value9); //10
	
	int a = 4;
	int b = 5;
	int c= 6;

	System.out.println(false && false);

	System.out.println(true | b++ > 6);
	System.out.println(true ^ c++ > 6);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);


	}
	
}
