import kr.poly.A;

public class TPC31 {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		System.out.println(a.toString());
		System.out.println(a);
		
		Object o = new A(); // up casting
		((A)o).display();
		
		System.out.println(o.toString());
	}

}

/*
 * 1. Object class, toString()
 * - 모든 클래스의 root 클래스
 * - 최상위 클래스(상속 관계에서)
 * - object 클래스를 잘 활용하면 프로그램을 유연하게 만들 수 있다.
 * 
 * 2. toString()
 * - 재정의를 안 했을 경우(번지 출력)
 * - 재정의를 했을 경우 (재정의된 메서드 활용)
 * 
 * 생략된 부분
 * 1. import java.lang.*;
 * 2. extends Object
 * 3. public A(){super();}
 */