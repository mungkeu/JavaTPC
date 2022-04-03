import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO();
		m.setName("ȫ�浿");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("����");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.println(m.getAddr()+"\t");
	}

}

/*
 * �� ����� Ŭ���� (Model.DTO,VO)
 * 
 * MemberVO m = new MemberVO() -> �������� -> �ν��Ͻ��� ���������� ��ȣ�ؾ� �Ѵ�.
 * 
 * ��������(private) : �ٸ� ��ü(class)�� ���� ������ ���� ��(private)
 * 
 * 
 * 
 *  this  ��  ->   			 private                            public
 *  m     ��  ->   ��(name) ��(age) ��(tel) ��(addr) | ��(Setter Method) ��(Getter Method)
 *  
 * setter method�� ���� �����ϰ�
 * getter method�� ���� ���´�.
 * 
 * ��� ����������� ���������Ѵ�.
 */