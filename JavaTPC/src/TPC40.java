
public class TPC40 {

	public static void main(String[] args) {
		
		int a=1;
		Integer b = new Integer(1); // ��� �̰��� ����. 
		Integer c = 3; // �����Ϸ��� ���� �ڽ��� �ڵ����� �̷������. �ڹ� �ֽŹ������� ���ʹ� �̰� �⺻�� �Ǿ���.
		// ������ ���� ������ �߾˾ƾ��Ѵ� Integer�� int�� �ƿ� Ÿ���� �ٸ���. ������������ �س��� ��.!
		
		System.out.println(b.intValue()); // 1
		System.out.println(b.toString()); // "1"
		
		Object[] obj = new Object[3];
		
		obj[0] = new Integer(1); 
		obj[1] = new Integer(2);
		obj[2] = new Integer(3);
		
		System.out.println(obj[0].toString()); // �ڽ��� Integer�� ������.
		System.out.println(obj[1].toString());
		System.out.println(obj[2].toString());
		
		// ������ �Ʒ��� ���� �ڽ��� �׳� �̿�����.
		obj[0] = 1; 
		obj[1] = 2;
		obj[2] = 3;
		
		// "100"+"100"=200
		String x = "100";
		String y = "100";
		//System.out.println(x+y); // "100100"
		int v1=Integer.parseInt(x);
		int v2=Integer.parseInt(y);
		System.out.println(v1+v2); // 200
		
		// 100+100="100100"
		String s1 = String.valueOf(v1);
		String s2 = String.valueOf(v2);
		System.out.println(s1+s2); // "100100"
	}

}
/*
 * Wrapper Ŭ����
 * - �⺻�ڷ����� ��ü �ڷ������� ����� �� �ֵ��� ����� ���� �ڷ���(���� Ŭ����)
 * 
 * �⺻�ڷ���			��ü�ڷ���
 * int				Integer
 * float			Float
 * char				Character
 * boolean			Boolean
 * 
 * ������ 1�� �����ϴ� ��� 2����
 * int a = 1;
 * Integer b = new Integer(1);    --> intValue(), toString(), parseInt()
 * int v = b.intValue();
 * 
 * ����ϴ� ����
 * �ڽ� Ŭ���� 				�ֻ��� Ŭ����
 * int <-------------------> Object   X int�� ��ü�� �ƴϴ�.
 * Integer <---------------> Object   O
 * 
 * �⺻�ڷ����� Object[] �迭�� ������ ���?
 * Object[] obj = new Object[3];	=> Object[] obj = new Object[3];
 * obj[0]=1;						=> obj[0] = new Integer(1);		
 * obj[1]=2;						=> obj[1] = new Integer(2);
 * obj[2]=3;						=> obj[2] = new Integer(3);
 * 
 * Integer a = 1; => Boxing
 * int b = new Integer(10); => Unboxing
 * 
 * �ڽ̰� ��ڽ��� �����Ϸ��� �ڵ����� ���ش�.
 * 
 * ���� ��ĵ� ��� �����Ϸ��� �����ϱ� ������ ��������� Ȯ���ϰ� ������ߴ�.
 * 1���� ���� ������ �ڹٴ� �������� �ʴ´�.
 */