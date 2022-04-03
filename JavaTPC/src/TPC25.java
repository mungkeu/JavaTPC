import kr.tpc.*;

public class TPC25 {

	public static void main(String[] args) {
		// 1. ������ �μ�
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(d);
		
		// 2. ������ �迭
		// Dog, Cat ������ �迭�� �����Ͻÿ�.
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i=0; i<ani.length; i++)
		{
			ani[i].eat();
			if(ani[i] instanceof Cat)
			{
				((Cat)ani[i]).night(); // down casting
			}
		}
		
		display(ani);
	}
	//                              up casting 
	public static void display(Animal r) // object�ε� ����.
	{
		r.eat();
		
		// Cat type���� ������� r�̸� true. �ƴϸ� false.
		if(r instanceof Cat) {
			((Cat)r).night(); // down casting
		}
	}
	
	public static void display(Animal[] ani) // ������ �迭
	{
		for(int i=0; i<ani.length; i++)
		{
			ani[i].eat();
			if(ani[i] instanceof Cat)
			{
				((Cat)ani[i]).night(); // down casting
			}
		}
	}
	
}

/*
 * 1. ������ �̷��� ��������(�θ� Ŭ������ �� Ȱ���϶�)
 * - ��Ӱ��谡 �Ǿ�� �Ѵ�.
 * - ��ü ������ up casting���� �� ��(���� Ŭ������ ���� Ŭ�������� �޼����� ������ �ϹǷ�)
 * 	 (up casting�� �Ǹ� down casting�� �� �� �ִ�.)
 * - ���� ���ε��� ���� �����ȴ�.
 * 	 (���� ���ε� : ����������� ���� �޼��尡 �����Ǵ� ���ε� ���α׷��� �ӵ��� ����߸��� ������ �ȴ�.)
 * 
 * 2. �������� Ȱ�� ���
 * 	1. �������μ�(������ �̵�)
 *  2. ������ �迭(���� �ٸ� ��ü�� ���� �� �ִ�.)
 */