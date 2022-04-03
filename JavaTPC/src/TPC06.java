
public class TPC06 {

	public static void main(String[] args) {
		// 메서드 -> 동작(method), 기능(function)
		int a=67, b=98;
		int result = sum(a,b);
		System.out.println(result);
		
		int[] arr=makeArr();
		int hap=0;
		for(int i=0; i<arr.length; i++)
		{
			hap+=arr[i];
		}
		System.out.println(hap);
	}
	
	// 정수 2개를 더하여 총합을 구하여 리턴하는 메서드를 정의하시오.
	public static int sum(int a, int b) // 호출하는 메서드가 static이므로 static을 붙여준다.
	{
		return a+b;
	}
	
	// 메서드를 리턴할 때도 여러개를 보내는게 아니라 묶어서 보내준다.
	public static int[] makeArr()
	{
		int[] arr= new int [3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		return arr;
	}
}

/*
 * 메서드 이름이 변수의 역할을 한다. 
 *
 * 함수가 매개변수를 전달하는 방법
 * Call by value : 값을 전달.
 */