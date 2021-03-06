
public class TPC08 {
	private void Main(String[] args) {
		int a=30;
		int b=50;
		add(a,b);	// static method call
	}
	
	public static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
}

/*
 *	JVM Memory Model
 *
 *	JVM의 TCP08 class(실행 클래스)를 실행하는 절차
 *	1. 대부분 해당 클래스의 현재 디렉토리에서 찾는다.
 *  2. 찾으면 클래스 내부에 있는 static 키워드가 있는 메서드를 메모리로 로딩한다.
 *	   - method Area의 static zone에 로딩한다. main(), add() method
 *	3. static zone에서 main() 메소드를 실행한다.(호출 시작)
 *	   - main() method가 호출되면 main() method의 호출정보가 Stack Area에 들어간다.(push)
 *	   - 프로그램이 시작되는 부분이다.(PC의 위치가 현재 동작되고 있는 메서드다.)
 *	4. Stack Area가 비어 있으면 프로그램이 종료된 것이다.
 *
 * JVM의 4가지 메모리 영역
 * 		method Area      		  				stack Area     					     heap Area      				literal Pool
 * 	   1. static zone
 * 			main(TPC08)								add
 * 				|call							(a:10,b:20,c:30)
 * 				v									 ㅅ
 * 			add(TPC08)								 | return ㄱ
 * 	   2. non-static zone						               |   
 * 													main     <ㅡ local(지역)
 *   Method의 byte code가 저장되는 영역				(a:10,b:20,c:30)
 *   (static zone, non statc zone			   메서드가 호출되면 메서드의
 *    으로 나누어짐)							   호출정보가 저장되는 영역
 * 											 (Call Stack Frame Area)  
 *  # 실행전에 static은 미리 로딩한다.
 *    고정된 위치에 자동으로 로딩.
 * 											# stack Area의 호출 스택
 * 										    프로그램 카운터의 위치 실행중인 위치
 * 											1. main (프로그램 실행) - 카운터 1(main)
 * 											2. main add	- 카운터 2(add)
 *                                          3. main - 카운터 1(main)
 *                                          4. 스택이 모두 비워짐 (프로그램 종료)
 *                                          
 *                                          # stack은 LIFO구조
 */
