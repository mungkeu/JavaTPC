import kr.tpc.BookVO;

public class TPC12 {

	public static void main(String[] args) {
		BookVO b1 = new BookVO("C���", 20000, "��������", 800);
		
		System.out.print(b1.title+"\t");
		System.out.print(b1.price+"\t");
		System.out.print(b1.company+"\t");
		System.out.println(b1.page+"\t");
	}

}
/*
 * ������ �޼���(Constructor)
 * 1. ��ü�� ������ �� ���Ǵ� �޼���
 * 2. ��ü ���� �� ��ü�� �ʱ�ȭ�� �ϴ� ���� ����
 * Ư¡
 * - Ŭ���� �̸��� ������ �޼���
 * - �޼����� return type�� ����. (void �ƴ�)
 * - public ���� ������ ������.(��, private �����ڵ� �ִ�.)
 * - �����ڰ� ���� ���� �⺻ �����ڰ� ���������.
 * 
 * �ߺ�����(Overloading)
 * - ������ �޼��带 Ȱ���Ͽ� ��ü�� �����ϰ� �ʱ�ȭ ����.
 */