import kr.poly.*;

public class TPC27 {

	public static void main(String[] args) {
		Remocon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		
		r= new Radio();
		r.chUp();
		r.chDown();
		r.internet();
	}

}

/*
 * 인터페이스 활용(100% 다형성 보장)
 * - 100% 추상메서드만 가능
 * - 구현된 메서드를 가질 수 없다.
 * - 서로 기능이 다른 클래스들을 공통으로 묶을 때 사용한다.
 * 
 * - implements(구현한다) 받은 하위 클래스들은 반드시 해당 상위 클래스의 추상 메서드를 override(재정의) 해야 한다. 
 */