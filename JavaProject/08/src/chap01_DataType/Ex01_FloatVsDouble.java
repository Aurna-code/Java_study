package chap01_DataType;

// float과 double의 정밀도 비교 실습
public class Ex01_FloatVsDouble {
	public static void main(String[] args) {
		// #1. float의 정밀도 (대략 소수 7자리)
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.0000001f;
		System.out.println(f2);
		
		// #2. double의 정밀도 (대략 소수 15자리)
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
	}

}
