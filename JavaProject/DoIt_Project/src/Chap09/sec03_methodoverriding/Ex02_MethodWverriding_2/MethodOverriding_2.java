
// 메서드 오버라이딩의 대표적인 예 실습
package Chap09.sec03_methodoverriding.Ex02_MethodWverriding_2;

class Animal {
	void cry() {}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class MethodOverriding_2 {
	public static void main(String[] args) {
		// 각각의 타입으로 선언 + 각각의 타입으로 생성
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		// 배열로 관리
		Animal[] animals = {ab, ac, ad};
		for(Animal animal : animals) {
			animal.cry();
		}
	}

}
