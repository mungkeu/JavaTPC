
public class TPC36 {

	public static void main(String[] args) {
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		// 번지를 비교하므로 다르다.
		if(str1 == str2) {
			System.out.println("같다.");
		}
		else
		{
			System.out.println("다르다.");
		}
		
		
		// 값(APPLE)이 서로 같은걸 보고 같음이 나온다.
		if(str1.equals(str2)) {
			System.out.println("같다.");
		}
		else
		{
			System.out.println("다르다.");
		}
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		// 상수이므로 번지가 같으므로 같다.
		if(str3 == str4) {
			System.out.println("같다.");
		}
		else
		{
			System.out.println("다르다.");
		}
		
		// 값(APPLE)이 서로 같은걸 보고 같음이 나온다.
		if(str3.equals(str4)) {
			System.out.println("같다.");
		}
		else
		{
			System.out.println("다르다.");
		}
	}

}
/*
 * String 클래스
 * -> 자바에서 문자열은 쌍 따옴표 " "로 감싸면 된다.
 * -> 자바에서 문자열을 저장하는 기본 자료형(DataType)은 없다.
 * -> 문자열은 여러가지 조작을 할 수 있기 때문에 별도의 클래스로 자료형(java.lang.String)을 만들어 두었다.
 * -> 그래서 자바에서 문자열은 책, 영화, 회원 처럼 객체로 취급된다.
 * 
 * 문자열 생성방법
 *                                         서로 다른 번지
 * 1. new로 생성						   번지          메모리(string)
 * String str1 = new String("APPLE");  str1 ------> ㅁAPPLE        Heap Area
 * String str2 = new String("APPLE");  str2 ------> ㅁAPPLE       (객체가 생성되는 메모리 영역)
 * 
 * 2. 문자열 상수로 생성
 * String str3 = "APPLE";  => 자바에서는 ""에 있는 문자열을 객체로 본다.
 * String str4 = "APPLE";
 * - 문자열 상수는 Literal Pool(문자열 상수(객체)가 생성되는 메모리영역(재활용))에 생성되어 서로 같은 번지를 사용.
 */