package Chap08.sec01_accessmodifier.Ex02_AccessModifierOfClass_2;



import Chap08.sec01_accessmodifier.Ex02_AccessModifierOfClass_2.AA;
// import Chap08.sec01_accessmodifier.Ex02_AccessModifierOfClass_2.pack.BB; 불가능

public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		// 객체 생성
		AA a = new AA();	//클래스 AA는 public 생성자이므로 다른 패키지에서도 객체 선언(AA a)과 생성자 호출 가능
		// BB b = new BB(); //클래스 BB는 임포트를 할 수 없으므로 객체 선언과 생성자 호출 모두 불가능
		// CC c = new CC(); //클래스 CC는 객체는 선언할 수 있지만(CC c), default 생성자이므로 생성자 호출(new CC()) 불가능
	}

}
