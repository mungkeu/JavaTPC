import kr.tpc.MemberVO;

public class TPC16 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO("ȫ�浿", 40, "010-1111-1111", "����");
		// setter method - X �����ڷ� ��� �ʱ�ȭ �߱� ������.
		
		System.out.println(m.toString());
		
		MemberVO m1 = new MemberVO();
		m1.setName("�̱浿");
		m1.setAge(34);
		m1.setTel("010-2222-2222");
		m1.setAddr("����");
		
		System.out.println(m1.toString());
		// toString()�� ��������.
		System.out.println(m1);
	}

}
