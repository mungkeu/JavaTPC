import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		
		BookDTO b = new BookDTO();
		b.title="�ڹ�";
		b.price=17000;
		b.company="����";
		b.page=670;
	}

}

/*
 * �⺻�ڷ���(PDT) VS ����� �����ڷ���(UDDT)
 * - DataType�� Ȯ���� ����
 * 
 * class, object, instance ��ȣ����
 * - ��ü��������(new ������, ������ �޼���, this)
 * 
 * �� ����� Ŭ����
 * - DTO(VO), DAO, Utility
 * 
 * ��ü���� ����
 * BookDTO b = new BookDTO()
 * 
 * new : ��ɾ�
 * BookDTO() : ������ �޼���
 * 
 * ������ �޼��带 ȣ���ϸ�
 * - ���������� ��ü�� �����ϴ� ���� �Ѵ�.
 * - this��� �ڱ� �ڽ��� ����Ű�� ��ü�� �����ȴ�.
 */