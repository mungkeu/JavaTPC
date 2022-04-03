import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		
		// Animal <--- [Dog.class, Cat.class]
		Animal ani = new Dog();
		
		ani.eat();
		
		ani = new Cat();
		ani.eat();
	}

}

/*
 * Inheritance(상속)
 * 수평적 구조 vs 수직적 구조
 * 1. 상속 -> 클래스의 설계(행위적인 측면)
 * 
 *         수평적 설계                            수직적 설계(계층화, 상속구조)	
 * - 코드의 중복이 발생							- 수평적 설계의 단점을 극복한다.
 * - 새로운 요구사항에 대한 코드의 수정이 불가피		- 확장을 쉽게 할 수 있다.
 * - 관리하기가 어렵다(부모와 자식의 관계를 생각) 		- 코드가 복잡해 진다.(이점이 많다.)
 * 
 *  											 Animal (이름, 나이, 종, 먹다)     super class(상위, 부모)
 *  												^							- 추상화, 보편화, 일반화, 개념화
 *  									extends		|    extends
 *  											ㅡㅡㅡㅡㅡㅡ
 *  											|	    |					   sub class(하위, 자식)
 *     Dog - Cat(수평적)                         Dog    Cat						- 세분화, 상세화, 구체화, 구상화
 *     
 * 2. 상속 개념
 * 
 * 상속 Memory      ㅁ  상속 체이닝
 * Object          |
 * Animal          v
 * Dog Cat         
 * 
 * 상속에서 부모와 자식에 연결되는 방법
 * super() : 자신의 생성자에서 부모의 생성자를 호출
 */