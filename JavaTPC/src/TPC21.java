import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {

	public static void main(String[] args) {
		
		// �θ�        �ڽ�      : �ڵ� ����ȯ Object Casting
		Animal d = new Dog(); // : ū = ����  up casting
		d.eat();
		
		Dog d1 = new Dog();
		d1.eat();
		
		Animal c = new Cat();
		c.eat();
		
		// c.night();
		((Cat)c).night(); // �㿡 ���� ������. --> down casting (���� ����ȯ)
		
	}

}

/*
 * Override(������)
 * - ��Ӱ��迡�� ��ӹ��� ���� Ŭ������ ���� Ŭ������ ������ �����ϴ� ��
 * - �θ��� �޼���� �����Ѵ�.
 * - �޸𸮿� �θ�� �ڽ� �޼��尡 ���������� �ᱹ���� �ڽ� �޼��尡 ����ȴ�.
 * - Override�� ���� ���� Ŭ������ ������ �� �ִ�.
 * - ���� ���ε�(ȣ��� �޼��尡 ����������� �����Ǵ� ���ε�)
 *    - ���α׷��� �ӵ��� �������� ������ ������ ������ �� ���� ������ ��� �Ѵ�.
 *    - �� Animal�� Dog�� ������ �� ���� �ڽ��� eat���� ���� �������� ���� ���ε��� ����
 *      �ڽ��� eat�� ������ ����ȴ�.
 *    
 * Animal a = new Dog(); -> �� ĳ��Ʈ �ڵ����� ����ȯ.
 * 
 */