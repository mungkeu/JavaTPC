import kr.tpc.Inflearn;

public class TPC13 {

	public static void main(String[] args) {

		// Inflearn inf = new Inflearn(); //private ������.
		Inflearn.tpc();
		Inflearn.java();
		
		// Java API ������ private
		System.out.println("static �޼���");
		int v = Math.max(10, 20);
		System.out.println(v);
	}

}

/*
 * private ������ �޼���(Constructor)
 * - ��ü������ �����ϴ� ������ �޼��尡 private ������� ������ ��ü�� ����(new)�� �� ����.
 * 
 * non-static ����� ���(�ν��Ͻ� �޼���) ex) public void tpc()
 * - ��ü���� �� ���� ����
 * 
 * static ����� ���(Ŭ���� �޼���)  ex) public static void java()
 * ��ü���� ���� ���ٰ���(Ŭ���� �̸����� ����)
 * 
 * - static�� static ���� static main �޼���� �Բ� �ڵ����� �ö󰣴�.
 * - Ŭ������ ����ϴ� �������� static ����� ���� �ڵ����� �޸𸮿� �ε��� �ȴ�.
 *   �� ���Ŀ� ȣ���� �ȴ�.
 * - ��� �޼��尡 static�̸� �����ڰ� ���� �ʿ���� private���� ����Ѵ�.
 */