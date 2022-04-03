import kr.poly.A;

public class TPC31 {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		System.out.println(a.toString());
		System.out.println(a);
		
		Object o = new A(); // up casting
		((A)o).display();
		
		System.out.println(o.toString());
	}

}

/*
 * 1. Object class, toString()
 * - ��� Ŭ������ root Ŭ����
 * - �ֻ��� Ŭ����(��� ���迡��)
 * - object Ŭ������ �� Ȱ���ϸ� ���α׷��� �����ϰ� ���� �� �ִ�.
 * 
 * 2. toString()
 * - �����Ǹ� �� ���� ���(���� ���)
 * - �����Ǹ� ���� ��� (�����ǵ� �޼��� Ȱ��)
 * 
 * ������ �κ�
 * 1. import java.lang.*;
 * 2. extends Object
 * 3. public A(){super();}
 */