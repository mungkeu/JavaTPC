import kr.poly.*;

public class TPC28 {

	public static void main(String[] args) {
		// RemoCon으로 TV 클래스를 구동하시오
		
		Remocon r = new TV();
		for(int i=0; i<40; i++)
		{
			r.chUp();
		}
		for(int i=0; i<40; i++)
		{
			r.chDown();
		}
		r.internet();
	}

}
/*
 * 추상 클래스와 인터페이스 (다형성을 보장하기 위함)
 * 
 * 1. 추상 클래스
 * - 서로 기능이 비슷한 클래스의 공통 부분을 묶을 때 사용한다.
 * - 구현 메서드와 추상 메서드를 함께 가질 수 있다.
 * - 50% 디자인(설계), 50% 구현
 * - extends keyword 사용
 * - 구현 메서드를 가질 수 있다.
 * 
 * 2. 인터페이스
 * - 서로 기능이 다른 클래스의 공통부분을 묶을 때 사용한다.
 * - 100% 추상 메서드로 이루어진다.
 * - 100% 디자인(설계), 규약
 * - Implements keyword를 사용한다.
 * - 구현 메서드를 가질 수 없다.
 * - 다중상속 형태를 지원한다.
 * - final static 멤버변수를 가질 수 있다.
 * 
 * 3. 공통점
 * - 다형성을 보장하기 위해서 등장.
 * - 객체를 생성 할 수 없다(new X)
 * - 하위 클래스에 의해 구현되어야 한다.(override: 재정의 필수)
 * - 부모(상위 클래스)의 역할로 사용한다. (up casting으로 객체를 생성)
 * - 추상 메서드를 가진다.
 */