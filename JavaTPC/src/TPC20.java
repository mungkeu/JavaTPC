import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		
		// Animal <--- [Dog.class, Cat.class]
		Animal ani = new Dog();
		
		ani.eat();
		
		ani = new Cat();
		ani.eat();
	}

}

/*
 * Inheritance(���)
 * ������ ���� vs ������ ����
 * 1. ��� -> Ŭ������ ����(�������� ����)
 * 
 *         ������ ����                            ������ ����(����ȭ, ��ӱ���)	
 * - �ڵ��� �ߺ��� �߻�							- ������ ������ ������ �غ��Ѵ�.
 * - ���ο� �䱸���׿� ���� �ڵ��� ������ �Ұ���		- Ȯ���� ���� �� �� �ִ�.
 * - �����ϱⰡ ��ƴ�(�θ�� �ڽ��� ���踦 ����) 		- �ڵ尡 ������ ����.(������ ����.)
 * 
 *  											 Animal (�̸�, ����, ��, �Դ�)     super class(����, �θ�)
 *  												^							- �߻�ȭ, ����ȭ, �Ϲ�ȭ, ����ȭ
 *  									extends		|    extends
 *  											�ѤѤѤѤѤ�
 *  											|	    |					   sub class(����, �ڽ�)
 *     Dog - Cat(������)                         Dog    Cat						- ����ȭ, ��ȭ, ��üȭ, ����ȭ
 *     
 * 2. ��� ����
 * 
 * ��� Memory      ��  ��� ü�̴�
 * Object          |
 * Animal          v
 * Dog Cat         
 * 
 * ��ӿ��� �θ�� �ڽĿ� ����Ǵ� ���
 * super() : �ڽ��� �����ڿ��� �θ��� �����ڸ� ȣ��
 */