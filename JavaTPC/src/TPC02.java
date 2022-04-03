
public class TPC02 {

	public static void main(String[] args) {
		int a, b, c;
		a=1;
		b=1;
		c = a + b;
		
		System.out.println(c);
		
		float f; // float, double
		f=34.5f; // java는 기본적으로 double형이므로 뒤에 f로 명시적으로 표현해 준다.
		System.out.println(f);
		
		char d;
		d='A'; // 문자 1개
		System.out.println(d);
		
		boolean g;
		g=true; // false(거짓), true(참)
		System.out.println(g);

	}

}

/*
 * 프로그래밍의 3대 요소
 * - 변수, 자료형(DataType), 할당(=)
 * 
 * a  b  c -> 메모리의 이름(변수:데이터를 저장할 메모리 공간의 이름)
 * ㅁ ㅁ  ㅁ  메모리
 * 
 * 변수 -> 기억공간
 * 1. 크기는 얼마만큼 할당할 것인가?
 * 2. 어떤 종류의 data를 저장할 것인가?
 * 위의 1, 2을 자료형 (Data Type)이라고 한다.
 * 
 * 4byte 정수 int
 * 4byte 실수 float
 * 2byte 문자 1개 char
 * 
 * a 변수에 정수를 할당하겠다. -> int a;
 * ㅁ -> 4byte 만큼의 메모리를 할당.
 * 
 * 기본 자료형(PDT): 컴파일러에서 기본적으로 제공해주는 자료형
 * boolean, char, int, double...
 * 
 * 사용자정의 자료형(UDDT)
 * - 객체 자료형(Object Data Type)
 * - 필요에 의해서 새롭게 만들어 사용하는 자료형
 * - 만드는 도구, 설계하는 도구, 모델링하는 도구가 필요하다. : class
 * 책    : BookDTO  자바의정석(제목, 가격, 출판사)
 * 회원  : MemberVO "김길동(이름, 주소, 전화번호)
 * 문자열 : String   "APPLE"
 * 
 * Symbol Table(변수 목록표)
 * 변수이름(key) 번지(value)        Memory  address(번지) 
 *   a			100번지    ->      10     (메모리 주소:100)
 *   b			200번지    ->      34.5   (메모리 주소:200)
 *   c          300번지    ->      can not find symbol 에러
 */