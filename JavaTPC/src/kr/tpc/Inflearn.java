package kr.tpc;

public class Inflearn {
	// 클래스 메서드
	public static void tpc()
	{
		System.out.println("TPC강의 너무 재미있다.");
	}
	// 인스턴스 메서드
	public static void java()
	{
		System.out.println("Java강의 너무 재미있다.");
	}
	// private 생성자를 만들기 위해서는 나머지 메서드를 static으로 만든다.
	private Inflearn()
	{
		
	}
}
