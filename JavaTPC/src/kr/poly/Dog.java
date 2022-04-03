package kr.poly;

public class Dog extends Animal {
	
	public Dog()
	{
		super(); // 부모의 생성자를 호출.
	}

	@Override
	public void eat() {
		System.out.println("개 처럼 먹다.");
		
	}
}
