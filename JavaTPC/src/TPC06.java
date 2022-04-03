
public class TPC06 {

	public static void main(String[] args) {
		// �޼��� -> ����(method), ���(function)
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
	
	// ���� 2���� ���Ͽ� ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�.
	public static int sum(int a, int b) // ȣ���ϴ� �޼��尡 static�̹Ƿ� static�� �ٿ��ش�.
	{
		return a+b;
	}
	
	// �޼��带 ������ ���� �������� �����°� �ƴ϶� ��� �����ش�.
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
 * �޼��� �̸��� ������ ������ �Ѵ�. 
 *
 * �Լ��� �Ű������� �����ϴ� ���
 * Call by value : ���� ����.
 */