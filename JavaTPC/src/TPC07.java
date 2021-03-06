

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
		return v; // -> v의 값을 sum에 저장해 반환
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
 * Call By Value(값 전달 기법) : 기억공간 개별
 * 
 * int a=10; int b=20;
 * int v = sum(a,b); -> method 호출부, a,b는 실인수라고 한다.
 * public int sum(int a, int b) -> method 정의부, a, b는 가인수라고 한다.
 * - 실인수와 가인수의 갯수는 같아야 한다.
 * 
 * Call By Reference(주소 전달 기법) : 기억공간 공유
 * int[] arr={10,20,30};
 * public int sum(int[] a) -> arr과 a가 같은 기억공간을 가리킥 ㅗ있다.
 */