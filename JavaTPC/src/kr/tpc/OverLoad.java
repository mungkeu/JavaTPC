package kr.tpc;

// ����(method)���θ� �̷���� ��ü
public class OverLoad {
	public void hap(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void hap(float a, int b)
	{
		System.out.println(a+b);
	}
	
	public void hap(float a, float b)
	{
		System.out.println(a+b);
	}
}