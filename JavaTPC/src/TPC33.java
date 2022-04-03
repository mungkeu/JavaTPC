
public class TPC33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * Part-2 학습정리
 * 
 * 객체지향 프로그래밍의 3대 특징
 * - 정보은닉 (Information Hiding)
 * - 상속		(Inheritance)
 * - 다형성	(polymorphism)
 * 
 * message polymorphism(다형성)
 * - 상속관계에 있는 클래스에서 상위클래스가 동일한 메시지로 하위클래스들을 서로 
 *   다르게 동작시키는 객체지향 원리(개념)
 * 
 * 다형성 이론의 전제조건
 * - 상속관계가 되어야 한다.
 * - 객체생성을 up casting으로 할 것(상위 클래스가 하위클래스에게 메세지를 보내야 하므로)
 *   (up casting이 되면 down casting을 할 수 있다)
 * - 하위클래스가 반드시 재정의(override)해야 한다. (다형성이 보장되기 위해서는)
 * - 동적 바인딩을 통해 실현된다.
 *   (동적 바인딩 : 실행시점에서 사용될 메서드가 결정되는 바인딩, 프로그램의 속도를 떨어뜨리는 원인이 된다.)
 * 
 * 추상클래스와 인터페이스의 공통점
 * - 다형성을 보장하기 위해서 등장
 * - 객체를 생성 할 수 없다(new X)
 * - 하위 클래스에 의해 구현되어야 한다. (override: 재정의 필수)
 * - 부모(상위 클래스)의 역활로 사용한다. (up casting으로 객체를 생성)
 * - 추상 메서드를 가진다.
 */