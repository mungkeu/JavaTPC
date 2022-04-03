import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {

	public static void main(String[] args) {
		
		// 부모        자식      : 자동 형변환 Object Casting
		Animal d = new Dog(); // : 큰 = 작은  up casting
		d.eat();
		
		Dog d1 = new Dog();
		d1.eat();
		
		Animal c = new Cat();
		c.eat();
		
		// c.night();
		((Cat)c).night(); // 밤에 눈이 빛난다. --> down casting (강제 형변환)
		
	}

}

/*
 * Override(재정의)
 * - 상속관계에서 상속받은 하위 클래스가 상위 클래스의 동작을 수정하는 것
 * - 부모의 메서드는 무시한다.
 * - 메모리에 부모와 자식 메서드가 공존하지만 결국에는 자식 메서드가 실행된다.
 * - Override를 통해 하위 클래스를 접근할 수 있다.
 * - 동적 바인딩(호출될 메서드가 실행시점에서 결정되는 바인딩)
 *    - 프로그램의 속도가 떨어지는 원인이 되지만 이점이 더 많기 때문에 사용 한다.
 *    - 즉 Animal은 Dog에 접근할 수 없어 자신의 eat지만 실행 시점에서 동적 바인딩에 의해
 *      자식의 eat에 접근해 실행된다.
 *    
 * Animal a = new Dog(); -> 업 캐스트 자동으로 형변환.
 * 
 */