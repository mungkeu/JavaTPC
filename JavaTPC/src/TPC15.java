import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO();
		m.setName("홍길동");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("서울");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.println(m.getAddr()+"\t");
	}

}

/*
 * 잘 설계된 클래스 (Model.DTO,VO)
 * 
 * MemberVO m = new MemberVO() -> ㅁㅁㅁㅁ -> 인스턴스의 상태정보를 보호해야 한다.
 * 
 * 정보은닉(private) : 다른 객체(class)로 부터 접근을 막는 것(private)
 * 
 * 
 * 
 *  this  ㅁ  ->   			 private                            public
 *  m     ㅁ  ->   ㅁ(name) ㅁ(age) ㅁ(tel) ㅁ(addr) | ㅁ(Setter Method) ㅁ(Getter Method)
 *  
 * setter method로 값을 저장하고
 * getter method로 값을 얻어온다.
 * 
 * 모든 멤버변수들은 정보은닉한다.
 */