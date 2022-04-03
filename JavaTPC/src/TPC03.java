import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a=10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b;
		b = new Book(); // 객체 생성.
		b.title = "자바";
		b.price=15000;
		b.company="한빛미디어";
		b.page=700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page+"\t");
		
		PersonVO p;
		p = new PersonVO();
		p.name="손기명";
		p.age=30;
		p.weight=64.f;
		p.height=175.f;
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
	}
}
/*
 * 관계를 이해하자.
 * PDT   VS   UDDT 
 * 
 * book => 제목, 가격, 출판사...
 * 
 * 제목   가격  출판사...
 * ㅁ     ㅁ   ㅁ ...
 * 
 * 위와 같은 구조를 설계한다 -> class
 * Book b -> b는 book의 번지를 저장할 수 있다. 즉 생성시 생성된 book의 번지를 저장한다.
 *
 * 객체를 VO(Value Object)라고 한다.
 * - 데이터를 담기 위해서 하나의 구조로 만들어 놓은 객체
 * 
 * DTO(Data Transfer Object)
 * - 데이터를 이동하는 객체. 
 * - 즉, 이동할 수 있는 객체
 * 
 * Book VO
 * Book DTO
 * 			      t p c p
 * b (100번지) ->  ㅁㅁㅁㅁ    : 이렇게 생성된 실체를 인스턴스라고한다.
 *               100번지
 * 인스턴스 객체 or
 * 객체 변수
 */           
