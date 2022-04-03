import kr.tpc.OverLoad;

public class TPC17 {

	public static void main(String[] args) {
		OverLoad ov = new OverLoad();
		
		ov.hap(20, 50);
		ov.hap(23.4f, 56);
		ov.hap(56.7f, 78.9f);
	}

}
/*
 * �޼��� �����ε�(Method Overloading)
 * - ���� �̸��� �޼ҵ带 ���� �� �����鼭 �Ű������� ������ ������ �ٸ����� �ϴ� ���
 * - �޼����� signature�� �ٸ��� �ȴ�.
 * - signature : �Ű������� Ÿ��, ����
 * 
 * �����Ϸ��� ������ �޼����� �̸�
 * 
 * hap_int_int(int a, int b)
 * hap_float_int(float a, int b)
 * hap_float_float(float a, float b)
 * 
 * �����ε�(Overloading)
 * - ���� ���ε�(������ �������� ȣ��� �޼��尡 �̹� �����Ǿ� �ִ� ���ε�)
 * - �ӵ��ʹ� ���谡 ����.
 * - ��, ������ ������ ����ÿ��� �̹� �� ������ �־� �ӵ��� �������.
 */