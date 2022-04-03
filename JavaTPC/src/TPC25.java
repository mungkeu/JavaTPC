import kr.tpc.*;

public class TPC25 {

	public static void main(String[] args) {
		// 1. 다형성 인수
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(d);
		
		// 2. 다형성 배열
		// Dog, Cat 저장할 배열을 생성하시오.
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i=0; i<ani.length; i++)
		{
			ani[i].eat();
			if(ani[i] instanceof Cat)
			{
				((Cat)ani[i]).night(); // down casting
			}
		}
		
		display(ani);
	}
	//                              up casting 
	public static void display(Animal r) // object로도 가능.
	{
		r.eat();
		
		// Cat type으로 만들어진 r이면 true. 아니면 false.
		if(r instanceof Cat) {
			((Cat)r).night(); // down casting
		}
	}
	
	public static void display(Animal[] ani) // 다형성 배열
	{
		for(int i=0; i<ani.length; i++)
		{
			ani[i].eat();
			if(ani[i] instanceof Cat)
			{
				((Cat)ani[i]).night(); // down casting
			}
		}
	}
	
}

/*
 * 1. 다형성 이론의 전제조건(부모 클래스를 잘 활용하라)
 * - 상속관계가 되어야 한다.
 * - 객체 생성을 up casting으로 할 것(상위 클래스가 하위 클래스에게 메세지를 보내야 하므로)
 * 	 (up casting이 되면 down casting을 할 수 있다.)
 * - 동적 바인딩을 통해 실현된다.
 * 	 (동적 바인딩 : 실행시점에서 사용될 메서드가 결정되는 바인딩 프로그램의 속도를 떨어뜨리는 원인이 된다.)
 * 
 * 2. 다형성의 활용 방법
 * 	1. 다형성인수(데이터 이동)
 *  2. 다형성 배열(서로 다른 객체를 담을 수 있다.)
 */