import kr.tpc.*;

public class TPC24 {

	public static void main(String[] args) {
		// up casting
		// Cat ani = new Cat();
		// Object ani = new Cat();
		Animal ani = new Cat();
		ani.eat(); // 컴파일 시점 -> Animal
		
		// down casting
		// Cat c =(Cat)ani;
		// c.eat();
		((Cat)ani).night(); // .이 ()보다 연산자 우선순위가 높다.
		
		ani = new Dog();
		ani.eat();
		// 다형성 (message polymorphism)
		// 상위클래스가 하위클래스에게 동일한 메세지로 서로다르게 동작시키는 원리
		
		Object o=new Dog();
		((Dog)o).eat();
	}

}

/*
 * 업 캐스팅
 * Animal r = new Dog();
 * r= new Cat();
 * 
 * 다운 캐스팅 (업 캐스팅이 선행되어야 한다.)
 * - 강제 형변환.
 * Dog g = (Dog)r;
 * Cat c = (Cat)r;
 */