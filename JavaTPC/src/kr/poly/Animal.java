package kr.poly;

// �߻� Ŭ���� (�ҿ����� ��ü) -> Animal ani = new Animal(); X
public abstract class Animal {
	// Dog, Cat --> eat()
	public abstract void eat(); // �߻� �޼��� (�ҿ����� �޼���)
	
	public void move() // ���� �޼���
	{
		System.out.println("������ ��� �̵��Ѵ�.");
	}
}
