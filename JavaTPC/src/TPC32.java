import kr.tpc.*;

public class TPC32 {

	public static void main(String[] args) {
		// ������ �μ�
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
		
		// ������ �迭
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
 * Object class�� Ȱ�� (������ �μ�, ������ �迭)
 * - ���� �ٸ� ��ü�� (A,B) �迭�� ���� �Ϸ��� �θ� ��ü(Object)�� Ȱ���϶�
 */