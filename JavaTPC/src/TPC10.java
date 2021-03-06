import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		
		BookDTO b = new BookDTO();
		b.title="자바";
		b.price=17000;
		b.company="영진";
		b.page=670;
	}

}

/*
 * 기본자료형(PDT) VS 사용자 정의자료형(UDDT)
 * - DataType을 확실히 이해
 * 
 * class, object, instance 상호관계
 * - 객체생성과정(new 연산자, 생성자 메서드, this)
 * 
 * 잘 설계된 클래스
 * - DTO(VO), DAO, Utility
 * 
 * 객체생성 과정
 * BookDTO b = new BookDTO()
 * 
 * new : 명령어
 * BookDTO() : 생성자 메서드
 * 
 * 생성자 메서드를 호출하면
 * - 내부적으로 객체를 생성하는 일을 한다.
 * - this라는 자기 자신을 가리키는 개체가 생성된다.
 */