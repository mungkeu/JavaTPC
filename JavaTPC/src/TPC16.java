import kr.tpc.MemberVO;

public class TPC16 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO("홍길동", 40, "010-1111-1111", "서울");
		// setter method - X 생성자로 모두 초기화 했기 때문에.
		
		System.out.println(m.toString());
		
		MemberVO m1 = new MemberVO();
		m1.setName("이길동");
		m1.setAge(34);
		m1.setTel("010-2222-2222");
		m1.setAddr("광주");
		
		System.out.println(m1.toString());
		// toString()는 생략가능.
		System.out.println(m1);
	}

}
