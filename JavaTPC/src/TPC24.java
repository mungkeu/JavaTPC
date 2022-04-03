import kr.tpc.*;

public class TPC24 {

	public static void main(String[] args) {
		// up casting
		// Cat ani = new Cat();
		// Object ani = new Cat();
		Animal ani = new Cat();
		ani.eat(); // ������ ���� -> Animal
		
		// down casting
		// Cat c =(Cat)ani;
		// c.eat();
		((Cat)ani).night(); // .�� ()���� ������ �켱������ ����.
		
		ani = new Dog();
		ani.eat();
		// ������ (message polymorphism)
		// ����Ŭ������ ����Ŭ�������� ������ �޼����� ���δٸ��� ���۽�Ű�� ����
		
		Object o=new Dog();
		((Dog)o).eat();
	}

}

/*
 * �� ĳ����
 * Animal r = new Dog();
 * r= new Cat();
 * 
 * �ٿ� ĳ���� (�� ĳ������ ����Ǿ�� �Ѵ�.)
 * - ���� ����ȯ.
 * Dog g = (Dog)r;
 * Cat c = (Cat)r;
 */