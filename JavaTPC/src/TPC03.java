import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		int a;
		a=10;
		
		// å 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		Book b;
		b = new Book(); // ��ü ����.
		b.title = "�ڹ�";
		b.price=15000;
		b.company="�Ѻ��̵��";
		b.page=700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page+"\t");
		
		PersonVO p;
		p = new PersonVO();
		p.name="�ձ��";
		p.age=30;
		p.weight=64.f;
		p.height=175.f;
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
	}
}
/*
 * ���踦 ��������.
 * PDT   VS   UDDT 
 * 
 * book => ����, ����, ���ǻ�...
 * 
 * ����   ����  ���ǻ�...
 * ��     ��   �� ...
 * 
 * ���� ���� ������ �����Ѵ� -> class
 * Book b -> b�� book�� ������ ������ �� �ִ�. �� ������ ������ book�� ������ �����Ѵ�.
 *
 * ��ü�� VO(Value Object)��� �Ѵ�.
 * - �����͸� ��� ���ؼ� �ϳ��� ������ ����� ���� ��ü
 * 
 * DTO(Data Transfer Object)
 * - �����͸� �̵��ϴ� ��ü. 
 * - ��, �̵��� �� �ִ� ��ü
 * 
 * Book VO
 * Book DTO
 * 			      t p c p
 * b (100����) ->  ��������    : �̷��� ������ ��ü�� �ν��Ͻ�����Ѵ�.
 *               100����
 * �ν��Ͻ� ��ü or
 * ��ü ����
 */           