package chap01_DataType;

public class Ex06_OperationBetwwenDataType {
	public static void main(String[] args) {
		
		int value1 = 3+5;
		int value2 = 8/5;
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0/5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		// byte value5 = data1 + data2 ; //오류
		int value5 = data1 + data2;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		//int value6 = 5 + 3.5; // 오류
		double value6 = 5 + 3.5;
		int value7 = 5 + (int)3.5;
		
		double value8 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4;
		double value10 = data3 + data4;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		System.out.println((int)5.6 + 3.5);
	}

}
