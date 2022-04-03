
public class TPC40 {

	public static void main(String[] args) {
		
		int a=1;
		Integer b = new Integer(1); // 사실 이것이 정석. 
		Integer c = 3; // 컴파일러에 의해 박싱이 자동으로 이루어진다. 자바 최신버전에서 부터는 이게 기본이 되었다.
		// 하지만 위의 정석을 잘알아야한다 Integer와 int는 아에 타입이 다르다. 편히쓰기위해 해놓은 것.!
		
		System.out.println(b.intValue()); // 1
		System.out.println(b.toString()); // "1"
		
		Object[] obj = new Object[3];
		
		obj[0] = new Integer(1); 
		obj[1] = new Integer(2);
		obj[2] = new Integer(3);
		
		System.out.println(obj[0].toString()); // 자식인 Integer가 재정의.
		System.out.println(obj[1].toString());
		System.out.println(obj[2].toString());
		
		// 이제는 아래와 같이 박싱을 그냥 이용하자.
		obj[0] = 1; 
		obj[1] = 2;
		obj[2] = 3;
		
		// "100"+"100"=200
		String x = "100";
		String y = "100";
		//System.out.println(x+y); // "100100"
		int v1=Integer.parseInt(x);
		int v2=Integer.parseInt(y);
		System.out.println(v1+v2); // 200
		
		// 100+100="100100"
		String s1 = String.valueOf(v1);
		String s2 = String.valueOf(v2);
		System.out.println(s1+s2); // "100100"
	}

}
/*
 * Wrapper 클래스
 * - 기본자료형을 객체 자료형으로 사용할 수 있도록 만들어 놓은 자료형(포장 클래스)
 * 
 * 기본자료형			객체자료형
 * int				Integer
 * float			Float
 * char				Character
 * boolean			Boolean
 * 
 * 변수에 1을 저장하는 방법 2가지
 * int a = 1;
 * Integer b = new Integer(1);    --> intValue(), toString(), parseInt()
 * int v = b.intValue();
 * 
 * 사용하는 이유
 * 자식 클래스 				최상위 클래스
 * int <-------------------> Object   X int는 객체가 아니다.
 * Integer <---------------> Object   O
 * 
 * 기본자료형을 Object[] 배열에 저장할 경우?
 * Object[] obj = new Object[3];	=> Object[] obj = new Object[3];
 * obj[0]=1;						=> obj[0] = new Integer(1);		
 * obj[1]=2;						=> obj[1] = new Integer(2);
 * obj[2]=3;						=> obj[2] = new Integer(3);
 * 
 * Integer a = 1; => Boxing
 * int b = new Integer(10); => Unboxing
 * 
 * 박싱과 언박싱은 컴파일러가 자동으로 해준다.
 * 
 * 위의 방식도 사실 컴파일러가 지원하기 전에는 명시적으로 확실하게 해줘야했다.
 * 1점대 낮은 버전의 자바는 지원하지 않는다.
 */