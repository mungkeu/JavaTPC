import kr.tpc.BookDTO;

public class TPC14 {

	public static void main(String[] args) {

		// 책-> class(BookDTO)->객체->인스턴스
		
		// 아래의 데이터를 이동시킨다고 했을때 묶어서 보내는데 방법은 2가지가 있다.
		// 1. 배열 : 자료형이 다르면 불가능.
		// 2. 직접 설계 : class라는 도구를 사용 BookDTO or BookVO로 묶는다.
		String title="스프링";
		int price=25000;
		String company="제이펍";
		int page=890;
		
		BookDTO dto; // 현재의 dto는 객체(object)인 상태이다. 아무것도 가리키지 않음.
		
		dto = new BookDTO(title, price, company, page); // 현재의 dto는 인스턴스(Instance)인 상태이다.
		
		bookPrint(dto); // 이동 관점(DTO)으로 class를 설계했다. 데이터를 넘겨주자.
	}
	
	public static void bookPrint(BookDTO dto)
	{
		System.out.println(dto.title+"\t");
		System.out.println(dto.price+"\t");
		System.out.println(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}

}

/*
 * class, object, instance 상호관계
 * 
 * 
 * class는 객체를 설계하는 도구이다.  네임을 VO(데이터들을 하나의 객체로 만듬.)를 붙여도 되고, DTO(이동 측면)를 붙여도 된다.
 * class BookDTO() -> BookDTO라는 새로운 자료형을 class라는 도구를 사용해서 만든다. => 바구니(VO:Value Object) => 이동(DTO:Data Transfer Object)
 * {
 * 	public String title;
 *	public int price;
 *	public String company;
 *	public int page;
 * }
 * 
 * 							  Memory
 * 								ㅁ    ->  null
 *            Object  -> 현재 b1,b2,b3들은 값을 가리키지 않아(생성되지 않아) 무슨책인지 모른다. 그래서 객체라고 한다.
 * BookDTO 		b1
 * BookDTO 		b2
 * BookDTO 		b3
 * 
 * 			  instance -> 이제 구체적인 책을 가리킨다. 이제 구별이 되기 때문에 객체가아니라 인스턴스 (변수)라고 부른다.
 * BookDTO 		b1 		= 	new BookDTO();
 * BookDTO 		b2
 * BookDTO 		b3
 */