import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// ���� ������ Dog.class, Cat.class ���ϸ� �ִٸ�.
		Animal ani = new Dog(); // up casting
		/* 
		 * Dog ������ -> super()�� �θ��� �����ڸ� ���� ȣ��. -> �θ��� super()�� object Ŭ������ ���� ȣ��
		 * �� 1. object  ��� ü�̴�.
		 * �� 2. animal
		 * �� 3. dog
		 */
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		((Cat)ani).night(); // down casting
		
		// ������
		// �ϳ��� �޼��忡 ���� ���� �ٸ��� ���۵Ǵ� ����
	}

}
