import kr.tpc.BookVO;

public class TPC12 {

	public static void main(String[] args) {
		BookVO b1 = new BookVO("C언어", 20000, "교보문고", 800);
		
		System.out.print(b1.title+"\t");
		System.out.print(b1.price+"\t");
		System.out.print(b1.company+"\t");
		System.out.println(b1.page+"\t");
	}

}
/*
 * 생성자 메서드(Constructor)
 * 1. 객체를 생성할 때 사용되는 메서드
 * 2. 객체 생성 후 객체의 초기화를 하는 역할 수행
 * 특징
 * - 클래스 이름과 동일한 메서드
 * - 메서드의 return type이 없다. (void 아님)
 * - public 접근 권한을 가진다.(단, private 생성자도 있다.)
 * - 생성자가 없을 때는 기본 생성자가 만들어진다.
 * 
 * 중복정의(Overloading)
 * - 생성자 메서드를 활용하여 객체를 적절하게 초기화 하자.
 */