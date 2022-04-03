
public class TPC36 {

	public static void main(String[] args) {
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		// ������ ���ϹǷ� �ٸ���.
		if(str1 == str2) {
			System.out.println("����.");
		}
		else
		{
			System.out.println("�ٸ���.");
		}
		
		
		// ��(APPLE)�� ���� ������ ���� ������ ���´�.
		if(str1.equals(str2)) {
			System.out.println("����.");
		}
		else
		{
			System.out.println("�ٸ���.");
		}
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		// ����̹Ƿ� ������ �����Ƿ� ����.
		if(str3 == str4) {
			System.out.println("����.");
		}
		else
		{
			System.out.println("�ٸ���.");
		}
		
		// ��(APPLE)�� ���� ������ ���� ������ ���´�.
		if(str3.equals(str4)) {
			System.out.println("����.");
		}
		else
		{
			System.out.println("�ٸ���.");
		}
	}

}
/*
 * String Ŭ����
 * -> �ڹٿ��� ���ڿ��� �� ����ǥ " "�� ���θ� �ȴ�.
 * -> �ڹٿ��� ���ڿ��� �����ϴ� �⺻ �ڷ���(DataType)�� ����.
 * -> ���ڿ��� �������� ������ �� �� �ֱ� ������ ������ Ŭ������ �ڷ���(java.lang.String)�� ����� �ξ���.
 * -> �׷��� �ڹٿ��� ���ڿ��� å, ��ȭ, ȸ�� ó�� ��ü�� ��޵ȴ�.
 * 
 * ���ڿ� �������
 *                                         ���� �ٸ� ����
 * 1. new�� ����						   ����          �޸�(string)
 * String str1 = new String("APPLE");  str1 ------> ��APPLE        Heap Area
 * String str2 = new String("APPLE");  str2 ------> ��APPLE       (��ü�� �����Ǵ� �޸� ����)
 * 
 * 2. ���ڿ� ����� ����
 * String str3 = "APPLE";  => �ڹٿ����� ""�� �ִ� ���ڿ��� ��ü�� ����.
 * String str4 = "APPLE";
 * - ���ڿ� ����� Literal Pool(���ڿ� ���(��ü)�� �����Ǵ� �޸𸮿���(��Ȱ��))�� �����Ǿ� ���� ���� ������ ���.
 */