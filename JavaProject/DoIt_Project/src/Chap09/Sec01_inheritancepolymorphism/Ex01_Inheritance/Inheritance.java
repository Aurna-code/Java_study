// 클래스의 상속과 사용할 수 있는 멤버 실습
package Chap09.Sec01_inheritancepolymorphism.Ex01_Inheritance;

class Human {
	String name;
	int age;
	void eat() {}
	void sleep() {}
	}

// Human 클래스 상속
class Student extends Human {
	int studentlD;
	void goToSchool() {}
}

// Human 클래스 상속
class Worker extends Human {
	int workerlD;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		// Human 객체 생성
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		// Student 객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentlD = 128;	//추가로 정의한 멤버
		s.eat();
		s.sleep();
		s.goToSchool(); 	//추가로 정의한 멤버
		
		// Worker 객체 생성
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerlD = 128;	//추가로 정의한 멤버
		w.eat();
		w.sleep();
		w.goToWork(); 		//추가로 정의한 멤버
	}

}
