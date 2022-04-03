package kr.tpc;

public class Dog extends Animal {
	@Override
	public void eat()
	{
		System.out.println("강아지 처럼 먹다");
	}
	
	public Dog()
	{
		super(); // 부모의 생성자를 호출.
	}
}
