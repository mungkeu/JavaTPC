package kr.poly;
import java.lang.*;

public class A extends Object{
	public A()
	{
		super();
	}
	
	public void display()
	{
		System.out.println("���� A�̴�.");
	}

	// toString()
	@Override
	public String toString() {
		return "������ �޼��� �Դϴ�.";
	}	
}
