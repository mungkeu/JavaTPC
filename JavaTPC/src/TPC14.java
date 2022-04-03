import kr.tpc.BookDTO;

public class TPC14 {

	public static void main(String[] args) {

		// å-> class(BookDTO)->��ü->�ν��Ͻ�
		
		// �Ʒ��� �����͸� �̵���Ų�ٰ� ������ ��� �����µ� ����� 2������ �ִ�.
		// 1. �迭 : �ڷ����� �ٸ��� �Ұ���.
		// 2. ���� ���� : class��� ������ ��� BookDTO or BookVO�� ���´�.
		String title="������";
		int price=25000;
		String company="������";
		int page=890;
		
		BookDTO dto; // ������ dto�� ��ü(object)�� �����̴�. �ƹ��͵� ����Ű�� ����.
		
		dto = new BookDTO(title, price, company, page); // ������ dto�� �ν��Ͻ�(Instance)�� �����̴�.
		
		bookPrint(dto); // �̵� ����(DTO)���� class�� �����ߴ�. �����͸� �Ѱ�����.
	}
	
	public static void bookPrint(BookDTO dto)
	{
		System.out.println(dto.title+"\t");
		System.out.println(dto.price+"\t");
		System.out.println(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}

}

/*
 * class, object, instance ��ȣ����
 * 
 * 
 * class�� ��ü�� �����ϴ� �����̴�.  ������ VO(�����͵��� �ϳ��� ��ü�� ����.)�� �ٿ��� �ǰ�, DTO(�̵� ����)�� �ٿ��� �ȴ�.
 * class BookDTO() -> BookDTO��� ���ο� �ڷ����� class��� ������ ����ؼ� �����. => �ٱ���(VO:Value Object) => �̵�(DTO:Data Transfer Object)
 * {
 * 	public String title;
 *	public int price;
 *	public String company;
 *	public int page;
 * }
 * 
 * 							  Memory
 * 								��    ->  null
 *            Object  -> ���� b1,b2,b3���� ���� ����Ű�� �ʾ�(�������� �ʾ�) ����å���� �𸥴�. �׷��� ��ü��� �Ѵ�.
 * BookDTO 		b1
 * BookDTO 		b2
 * BookDTO 		b3
 * 
 * 			  instance -> ���� ��ü���� å�� ����Ų��. ���� ������ �Ǳ� ������ ��ü���ƴ϶� �ν��Ͻ� (����)��� �θ���.
 * BookDTO 		b1 		= 	new BookDTO();
 * BookDTO 		b2
 * BookDTO 		b3
 */