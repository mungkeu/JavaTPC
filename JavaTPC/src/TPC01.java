
public class TPC01 {

	public static void main(String[] args) {
		
		// syso + Ctrl + spaceBar
		System.out.println("Hello Java");
	}

}

/*
 * Java 구동 방식
 * 
 * bin 폴더에 TCP01.class(실행가능한 파일:byte code) 생성.
 * src 폴더에 TCP01.java(소스파일)
 * 
 * 
 * 1차 컴파일                      ->   exe code
 * byte code                            JVM
 * (javac.exe TPC01.java)          (java.exe TCP01)
 * 
 * 
 * 이유 : 어떤 운영체제일지 모르기 때문에 byte 코드로 생성 후 JVM이 운영체제 맞게 2차 컴파일
 *       을 수행해 실행코드를 생성한다.
 * 즉, Java 프로그램은 OS에 독립적으로 실행할 수 있다. JVM이라는 가상머신이 구동하기 때문이다.
 * 
 *                 exe code
 * byte code ------> JVM                JVM            JVM
 *                 window OS          Max OS         Linux OS
 *                 
 * OS 위에 JVM에 java 프로그램을 실행해 달라고 콜을 보낸다.
 * 그럼 컴파일된 바이트 코드를 JVM이 해당 운영체제에 맞는 실행 파일을 생성해 실행시켜 준다.
 * 
 * 한마디로 JVM이 있으면 어떠한 운영체제이든지 상관없이 독립적으로 구동할 수 있다!
 * 단, 속도가 느릴 수 있다. 또한 실행 파일로 만들기 위해서 JVM이 꼭 필요하므로 개발은 하지 않더라도
 * 실행을 하기 위해서  JRE를 설치해야 하는 불편함이 있다.
 */