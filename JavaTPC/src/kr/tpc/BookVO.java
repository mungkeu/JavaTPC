package kr.tpc;

// å(Object) -> ����, ����, ���ǻ�, ��������...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	// ����Ʈ ������ �޼��� ����.
	
	// ������ -> ����+�ʱ�ȭ 
	public BookVO()
	{
		
	}
	
	// ������ �޼����� �ߺ�����(overloading)
	public BookVO(String title, int price, String company, int page) 
	{
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
