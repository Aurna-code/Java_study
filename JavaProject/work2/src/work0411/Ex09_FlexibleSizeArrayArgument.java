
// 메서드의 가변 길이 배열 입력매개변수
package work0411;

import java.util.Arrays;

public class Ex09_FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		// method1(int...values)
		method1(1,2);
		method1(1,2,3);
		method1();
		// method2(String...value)
		method2("Hi", "Hell0");
		method2("Thxs", "very", "much");
		method2();
	}
	public static void method1(int...values) {
		System.out.println("배열의 길이 : "+  values.length);
		
		for(int k: values) {
			System.out.println(k + " ");
		}
		System.out.println();
	}
	public static void method2(String...values) {
		System.out.println("배열의 길이 : " + values.length);
	for(String k : values) {
		System.out.println(k + " ");
	}

}
}
