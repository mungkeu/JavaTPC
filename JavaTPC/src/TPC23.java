import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// 만일 나에게 Dog.class, Cat.class 파일만 있다면.
		Animal ani = new Dog(); // up casting
		/* 
		 * Dog 생성자 -> super()로 부모의 생성자를 먼저 호출. -> 부모의 super()로 object 클래스를 먼저 호출
		 * ㅁ 1. object  상속 체이닝.
		 * ㅁ 2. animal
		 * ㅁ 3. dog
		 */
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		((Cat)ani).night(); // down casting
		
		// 다형성
		// 하나의 메서드에 대해 서로 다르게 동작되는 원리
	}

}
