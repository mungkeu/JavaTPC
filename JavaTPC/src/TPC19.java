import java.lang.*;  // 디폴트 패키지(생략)

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtill;

public class TPC19 {

	public static void main(String[] args) {
		// 1. Java에서 제공해주는 class들... API
		// 문자열(Sting)                          str      string (APPLE)
		java.lang.String str = new String("APPLE");  //    ㅁ ----> ㅁㅁㅁㅁㅁ
		System.out.println(str.toLowerCase());
		
		// 2. 직접 만들어서 사용하는 class들.... DTO/VO/, DAO, Utility .. API
		MyUtill my = new kr.tpc.MyUtill();
		int sum=my.hap();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어 놓은 class... API
		// Gson -> json : https://mvnrepository.com/
		// 폴더에 넣은 후 추가할때는 프로젝트 우클릭 -> Build Path-> Configure Build Path -> 
		// Libraries -> Class Path 클릭 -> Add External JARs... 클릭 -> 저장해 놓은 폴더에서 해당 JAR파을 을 가져온다.
		Gson g = new Gson();
		BookVO vo = new BookVO("자바", 13000, "영진", 800);
		String json = g.toJson(vo);
		// {"title":"자바","price":13000,"company":"영진","page":800} JSON 구조로 바꿈, 객체를 문자열의 형태로 바꿈, 키 값 형태.
		System.out.println(json);
	}

}

/*
 * Part-1 학습정리
 * 
 * class - DataType 측면 : 새로운 자료형을 만드는(설계하는) 도구 = 모델링 도구
 * OOP(객체지향) 측면 : 객체의 상태정보와 행위정보를 추출하여 캡슐화 하는 도구
 * 
 * Model : class를 Model이라고 부른다. (역할이 정해지므로)
 * 
 * 우리가 만드는 Model의 종류 (3가지는 거의 대부분 만들게 되어있다.)
 * 1-1. DTO(Data Transfer Object)
 * - 데이터 구조, 데이터를 담는 역할, 이동하기 위해서 데이터를 담는다.
 * 1-2	VO(Value Object)
 * - 객체를 담아서 하나의 값(덩어리)으로 취급한다는 의미다.
 * 2. DAO(Data Access Object)
 * - 데이터를 처리하는 역할(비즈니스 로직), 데이터베이스와 CRUD하는 역할
 * 3. Utility(Helper Object)
 * - 도움을 주는 기능을 제공하는 역할(날짜, 시간, 통화, 인코딩 등)
 * 
 * 우리가 앞으로 사용하게 될 클래스들
 * - API(Application Programming Interface) -> MVNREPOSITORY -> 저장소 jar파일을 다운받아 사용.
 * 1. Java에서 제공해주는 class들
 * - String, System, Integer, ArrayList, Map 등
 * 2. 만들어 사용하는 class 들(DTO, DAO, Utility)
 * 3. 1, 2번이 아닌 다른 사람이 만들어서 제공해주는 class들
 * - Gson, Jsoup, POI, iText 등
 */