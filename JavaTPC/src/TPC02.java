
public class TPC02 {

	public static void main(String[] args) {
		int a, b, c;
		a=1;
		b=1;
		c = a + b;
		
		System.out.println(c);
		
		float f; // float, double
		f=34.5f; // java�� �⺻������ double���̹Ƿ� �ڿ� f�� ���������� ǥ���� �ش�.
		System.out.println(f);
		
		char d;
		d='A'; // ���� 1��
		System.out.println(d);
		
		boolean g;
		g=true; // false(����), true(��)
		System.out.println(g);

	}

}

/*
 * ���α׷����� 3�� ���
 * - ����, �ڷ���(DataType), �Ҵ�(=)
 * 
 * a  b  c -> �޸��� �̸�(����:�����͸� ������ �޸� ������ �̸�)
 * �� ��  ��  �޸�
 * 
 * ���� -> ������
 * 1. ũ��� �󸶸�ŭ �Ҵ��� ���ΰ�?
 * 2. � ������ data�� ������ ���ΰ�?
 * ���� 1, 2�� �ڷ��� (Data Type)�̶�� �Ѵ�.
 * 
 * 4byte ���� int
 * 4byte �Ǽ� float
 * 2byte ���� 1�� char
 * 
 * a ������ ������ �Ҵ��ϰڴ�. -> int a;
 * �� -> 4byte ��ŭ�� �޸𸮸� �Ҵ�.
 * 
 * �⺻ �ڷ���(PDT): �����Ϸ����� �⺻������ �������ִ� �ڷ���
 * boolean, char, int, double...
 * 
 * ��������� �ڷ���(UDDT)
 * - ��ü �ڷ���(Object Data Type)
 * - �ʿ信 ���ؼ� ���Ӱ� ����� ����ϴ� �ڷ���
 * - ����� ����, �����ϴ� ����, �𵨸��ϴ� ������ �ʿ��ϴ�. : class
 * å    : BookDTO  �ڹ�������(����, ����, ���ǻ�)
 * ȸ��  : MemberVO "��浿(�̸�, �ּ�, ��ȭ��ȣ)
 * ���ڿ� : String   "APPLE"
 * 
 * Symbol Table(���� ���ǥ)
 * �����̸�(key) ����(value)        Memory  address(����) 
 *   a			100����    ->      10     (�޸� �ּ�:100)
 *   b			200����    ->      34.5   (�޸� �ּ�:200)
 *   c          300����    ->      can not find symbol ����
 */