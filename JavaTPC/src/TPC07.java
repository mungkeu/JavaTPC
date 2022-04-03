

public class TPC07 {

	public static void main(String[] args) {
		int a=20;
		float b=56.7f;
		
		float v=sum(a,b); // Call By Value
		
		int[] arr= {1,2,3,4,5};
		int vv=arrSum(arr);
		
		System.out.println(v);
		System.out.println(vv);
	}
	
	public static float sum(int a, float b)
	{
		float v=a+b;
		return v; // -> v�� ���� sum�� ������ ��ȯ
	}
	public static int arrSum(int[] x)
	{
		int sum=0;
		
		for(int i=0; i<x.length; i++)
		{
			sum+=x[i];
		}
		return sum;
	}
}
/*
 * Call By Value(�� ���� ���) : ������ ����
 * 
 * int a=10; int b=20;
 * int v = sum(a,b); -> method ȣ���, a,b�� ���μ���� �Ѵ�.
 * public int sum(int a, int b) -> method ���Ǻ�, a, b�� ���μ���� �Ѵ�.
 * - ���μ��� ���μ��� ������ ���ƾ� �Ѵ�.
 * 
 * Call By Reference(�ּ� ���� ���) : ������ ����
 * int[] arr={10,20,30};
 * public int sum(int[] a) -> arr�� a�� ���� �������� ����ű ���ִ�.
 */