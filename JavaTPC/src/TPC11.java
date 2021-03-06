import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		// 책 1권을 저장하기 위해서 객체를 생성하시오.
		BookVO b = new BookVO();
		b.title="파이썬";
		b.price=16000;
		b.company="에이콘";
		b.page=700;
		
		System.out.println(b.title+"\t");
		System.out.println(b.price+"\t");
		System.out.println(b.company+"\t");
		System.out.println(b.page);
		
		BookVO b1 = new BookVO();
		b1.title="오라클";
		b1.price=16000;
		b1.company="이지스퍼블리싱";
		b1.page=560;
		
		System.out.println(b1.title+"\t");
		System.out.println(b1.price+"\t");
		System.out.println(b1.company+"\t");
		System.out.println(b1.page);
	}

}

/*
 * 하나의 값이다 VO 
 *
 * 1. 상태정보(변수) : attribute, property, member
 * 
 * 2. 행위정보 : 동작(method), 기능(function)
 */