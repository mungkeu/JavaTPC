
public class TPC08 {
	private void Main(String[] args) {
		int a=30;
		int b=50;
		add(a,b);	// static method call
	}
	
	public static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
}

/*
 *	JVM Memory Model
 *
 *	JVM�� TCP08 class(���� Ŭ����)�� �����ϴ� ����
 *	1. ��κ� �ش� Ŭ������ ���� ���丮���� ã�´�.
 *  2. ã���� Ŭ���� ���ο� �ִ� static Ű���尡 �ִ� �޼��带 �޸𸮷� �ε��Ѵ�.
 *	   - method Area�� static zone�� �ε��Ѵ�. main(), add() method
 *	3. static zone���� main() �޼ҵ带 �����Ѵ�.(ȣ�� ����)
 *	   - main() method�� ȣ��Ǹ� main() method�� ȣ�������� Stack Area�� ����.(push)
 *	   - ���α׷��� ���۵Ǵ� �κ��̴�.(PC�� ��ġ�� ���� ���۵ǰ� �ִ� �޼����.)
 *	4. Stack Area�� ��� ������ ���α׷��� ����� ���̴�.
 *
 * JVM�� 4���� �޸� ����
 * 		method Area      		  				stack Area     					     heap Area      				literal Pool
 * 	   1. static zone
 * 			main(TPC08)								add
 * 				|call							(a:10,b:20,c:30)
 * 				v									 ��
 * 			add(TPC08)								 | return ��
 * 	   2. non-static zone						               |   
 * 													main     <�� local(����)
 *   Method�� byte code�� ����Ǵ� ����				(a:10,b:20,c:30)
 *   (static zone, non statc zone			   �޼��尡 ȣ��Ǹ� �޼�����
 *    ���� ��������)							   ȣ�������� ����Ǵ� ����
 * 											 (Call Stack Frame Area)  
 *  # �������� static�� �̸� �ε��Ѵ�.
 *    ������ ��ġ�� �ڵ����� �ε�.
 * 											# stack Area�� ȣ�� ����
 * 										    ���α׷� ī������ ��ġ �������� ��ġ
 * 											1. main (���α׷� ����) - ī���� 1(main)
 * 											2. main add	- ī���� 2(add)
 *                                          3. main - ī���� 1(main)
 *                                          4. ������ ��� ����� (���α׷� ����)
 *                                          
 *                                          # stack�� LIFO����
 */