import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		// å 1���� �����ϱ� ���ؼ� ��ü�� �����Ͻÿ�.
		BookVO b = new BookVO();
		b.title="���̽�";
		b.price=16000;
		b.company="������";
		b.page=700;
		
		System.out.println(b.title+"\t");
		System.out.println(b.price+"\t");
		System.out.println(b.company+"\t");
		System.out.println(b.page);
		
		BookVO b1 = new BookVO();
		b1.title="����Ŭ";
		b1.price=16000;
		b1.company="�������ۺ�����";
		b1.page=560;
		
		System.out.println(b1.title+"\t");
		System.out.println(b1.price+"\t");
		System.out.println(b1.company+"\t");
		System.out.println(b1.page);
	}

}

/*
 * �ϳ��� ���̴� VO 
 *
 * 1. ��������(����) : attribute, property, member
 * 
 * 2. �������� : ����(method), ���(function)
 */