import kr.poly.*;

public class TPC27 {

	public static void main(String[] args) {
		Remocon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		
		r= new Radio();
		r.chUp();
		r.chDown();
		r.internet();
	}

}

/*
 * �������̽� Ȱ��(100% ������ ����)
 * - 100% �߻�޼��常 ����
 * - ������ �޼��带 ���� �� ����.
 * - ���� ����� �ٸ� Ŭ�������� �������� ���� �� ����Ѵ�.
 * 
 * - implements(�����Ѵ�) ���� ���� Ŭ�������� �ݵ�� �ش� ���� Ŭ������ �߻� �޼��带 override(������) �ؾ� �Ѵ�. 
 */