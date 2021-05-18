package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		/*
		 * Animal 타입의 객체배열 크기 5로 생성 
		 * 각 인데스에 무작위로 Dog 객체 또는 Cat 객체 생성 
		 * (이때, 매개변수 생성자를 이용하여 생성)
		 */

		Animal[] ani = new Animal[5];
		int count = 0;

		ani[count++] = new Dog("시바", "시바", 3);
		ani[count++] = new Cat("나비", "페르시안", "페르시아", "흰색");
		ani[count++] = new Dog("왈왈이", "세퍼드", 4);
		ani[count++] = new Cat("블루", "러시안블루", "러시아", "검은색");
		ani[count++] = new Dog("골댕이", "리트리버", 5);

		for (Animal animal : ani) {
			animal.speak();
		}
	}

}
