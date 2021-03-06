import kr.poly.*;

public class TPC26 {

	public static void main(String[] args) {
		// eat --- 재정의(override) ---> eat()
		Animal ani = new Dog();
		ani.eat();	// eat{?} --> eat{개}
		
		ani.move();
		
		ani = new Cat();
		ani.eat();	// eat{?} --> eat{고양이}
		
		ani.move();
		
		((Cat)ani).night();
		
		// Animal a = new Animal(); 추상 클래스는 객체생성 불가능. 
		// up casting 즉 부모의 역할로 사용 -> 명령을 내리는 쪽으로 사용
	}

}

/*
 * 추상 클래스(abstract class) 활용(일부 다형성 보장)
 * - 상속을 보면 하위 클래스가 재정의하면 굳이 구현부가 필요없다.
 * - 대신 반드시 상속받은 클래스는 구현부를 만들어야한다.
 * 
 * - 구현부가 없는 메서드를 추상 메서드라고 한다.(불안전한 메서드)
 * - 추상 메서드를 1개라도 가지고 있는 클래스는 추상 클래스라고 한다.
 * - 추상 클래스에는 구현 메서드도 가질 수 있다.
 * 
 * - 추상 클래스는 자신도 불안전하기 때문에 부모의 역할로만 사용할 수 있다.
 * Animal ani = new Animal(); 불가능.
 * 
 * ! 가장중요: 추상 클래스를 상속받은 클래스는 반드시 부모의 추상 메서드를 구현해야 한다.(재정의)
 *           구현을 하지 않으면 자식 또한 추상 메서드를 상속받아 추상 클래스가 되어버린다.
 *           
 *   기능이 비슷한 클래스를 모을 때에 주로 추상 클래스를 사용한다.
 *   
 *   서로 다른 기능을 가진 클래스들을 모을 때에는 인터페이스를 사용한다.
 */