
public class TPC01 {

	public static void main(String[] args) {
		
		// syso + Ctrl + spaceBar
		System.out.println("Hello Java");
	}

}

/*
 * Java ���� ���
 * 
 * bin ������ TCP01.class(���డ���� ����:byte code) ����.
 * src ������ TCP01.java(�ҽ�����)
 * 
 * 
 * 1�� ������                      ->   exe code
 * byte code                            JVM
 * (javac.exe TPC01.java)          (java.exe TCP01)
 * 
 * 
 * ���� : � �ü������ �𸣱� ������ byte �ڵ�� ���� �� JVM�� �ü�� �°� 2�� ������
 *       �� ������ �����ڵ带 �����Ѵ�.
 * ��, Java ���α׷��� OS�� ���������� ������ �� �ִ�. JVM�̶�� ����ӽ��� �����ϱ� �����̴�.
 * 
 *                 exe code
 * byte code ------> JVM                JVM            JVM
 *                 window OS          Max OS         Linux OS
 *                 
 * OS ���� JVM�� java ���α׷��� ������ �޶�� ���� ������.
 * �׷� �����ϵ� ����Ʈ �ڵ带 JVM�� �ش� �ü���� �´� ���� ������ ������ ������� �ش�.
 * 
 * �Ѹ���� JVM�� ������ ��� �ü���̵��� ������� ���������� ������ �� �ִ�!
 * ��, �ӵ��� ���� �� �ִ�. ���� ���� ���Ϸ� ����� ���ؼ� JVM�� �� �ʿ��ϹǷ� ������ ���� �ʴ���
 * ������ �ϱ� ���ؼ�  JRE�� ��ġ�ؾ� �ϴ� �������� �ִ�.
 */