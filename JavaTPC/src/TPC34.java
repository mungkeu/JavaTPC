//import kr.infrine.MyClass;
import kr.infrine.*;

public class TPC34 {

	public static void main(String[] args) {
		// 만일 다른 패키지의 클래스가 default 접근제한자 이면 접근 불가.
		// kr.infrine.MyClass mv = new kr.infrine.MyClass();
		MyClass mv = new MyClass();
		int v = mv.sum(10,100);
		System.out.println(v);
	}

}
/*
 * package(패키지)
 * - 기능이 비슷한 클래스를 모아서 관리하기 쉽게 하기 위해서 사용 
 * - package 외부에서 접근하는 것을 막을 때 사용
 * 
 * 클래스의 이름은 2가지이다.
 * 기본이름 : MyClass
 * 패키지를 포함한 이름(class full name) : kr.tpc.MyClass
 * 
 * - package 내부에 있는 클래스의 접근권한이 생략되면 기본적으로 default
 *   접근권한을 가진다. (public 접근권한이 아니다.)
 * 
 * default 접근권한
 * package 내부에 있는 클래스에게는 public 접근권한
 * package 외부에 있는 클래스에게는 private 접근권한
 * - public을 생략하면 default. 하지만 다른 패키지에서도 사용해야 하므로 public.
 * 
 * 접근방법을 알기위해서는
 * 1. class full name을 알아야 한다.
 * 2. 접근권한을 알아야 한다.(public)
 * 3. import 구문을 알아야 한다.
 * 
 * package 안에 만들어 지지 않은 클래스가 접근제어자를 생략하면 default가 아니라 public이다.
 */