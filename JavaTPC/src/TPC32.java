import kr.tpc.*;

public class TPC32 {

	public static void main(String[] args) {
		// 다형성 인수
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
		
		// 다형성 배열
		Object[] o = new Object[2];
		o[0] = new A();
		o[1] = new B();
		
		for(int i=0; i<o.length; i++)
		{
			if(o[i] instanceof A)
			{
				((A)o[i]).go();
			}else
			{
				((B)o[i]).go();
			}
		}
		
		printGo(o);
	}
	
	private static void display(Object o)
	{
		if(o instanceof A)
		{
			((A) o).go();
		}else
		{
			((B)o).go();
		}
	}
	
	private static void printGo(Object[] o)
	{
		for(int i=0; i<o.length; i++)
		{
			if(o[i] instanceof A)
			{
				((A)o[i]).go();
			}else
			{
				((B)o[i]).go();
			}
		}
	}
}

/*
 * Object class의 활용 (다형성 인수, 다형성 배열)
 * - 서로 다른 객체를 (A,B) 배열에 저장 하려면 부모 객체(Object)를 활용하라
 */