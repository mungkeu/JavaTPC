// import java.lang.*;

public class TPC35 {

	public static void main(String[] args) {
		
		java.lang.String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v);
		System.out.println(str.charAt(3)); 		// 3번쨰에 위치한 단어1개 
		System.out.println(str.length());		// 문자열의 길이
		System.out.println(str.indexOf("PL"));	// PL이라는 문자가 몇번째에 있는지
		System.out.println(str.indexOf("PX"));	// 일치하는게 없으면 -1반환
		System.out.println(str.replaceAll("P", "X")); // AXXLE, P를 X로 바꾼다.
	}

}

/*
 * Java API 접근하기 (JAVA API : 2단계 package로 구성된다.)
 * Java API 중에서 String Class에 접근하는 방법
 * 
 * src ------------jrt-fs.jar
 *  |					|
 *  ㅡㅡㅡTPC35			ㅡㅡ java (package)
 *        |                  |
 *        |                  ㅡㅡ lang (String...)
 *        |                  |
 *        |                  ㅡㅡ util (ArrayList...)
 *        |                  |
 *        |                  ㅡㅡ io
 *        |                  |
 *        |                  ㅡㅡ sql
 *        |					 |
 *        |					 ㅡㅡ net
 *        | 					  ^
 *        |                       |
 *        |ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ---|   
 *        
 * String 클래스의 이름은 2가지이다.
 * 기본이름 : String
 * 패키지를 포함한 이름*class full name) : java.lang.String
 * 
 * java.lang package는 디폴트 package로 클래스를 만들면 자동으로
 * import된다.
 * import java.lang.*
 */