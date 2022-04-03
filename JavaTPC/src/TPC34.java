//import kr.infrine.MyClass;
import kr.infrine.*;

public class TPC34 {

	public static void main(String[] args) {
		// ���� �ٸ� ��Ű���� Ŭ������ default ���������� �̸� ���� �Ұ�.
		// kr.infrine.MyClass mv = new kr.infrine.MyClass();
		MyClass mv = new MyClass();
		int v = mv.sum(10,100);
		System.out.println(v);
	}

}
/*
 * package(��Ű��)
 * - ����� ����� Ŭ������ ��Ƽ� �����ϱ� ���� �ϱ� ���ؼ� ��� 
 * - package �ܺο��� �����ϴ� ���� ���� �� ���
 * 
 * Ŭ������ �̸��� 2�����̴�.
 * �⺻�̸� : MyClass
 * ��Ű���� ������ �̸�(class full name) : kr.tpc.MyClass
 * 
 * - package ���ο� �ִ� Ŭ������ ���ٱ����� �����Ǹ� �⺻������ default
 *   ���ٱ����� ������. (public ���ٱ����� �ƴϴ�.)
 * 
 * default ���ٱ���
 * package ���ο� �ִ� Ŭ�������Դ� public ���ٱ���
 * package �ܺο� �ִ� Ŭ�������Դ� private ���ٱ���
 * - public�� �����ϸ� default. ������ �ٸ� ��Ű�������� ����ؾ� �ϹǷ� public.
 * 
 * ���ٹ���� �˱����ؼ���
 * 1. class full name�� �˾ƾ� �Ѵ�.
 * 2. ���ٱ����� �˾ƾ� �Ѵ�.(public)
 * 3. import ������ �˾ƾ� �Ѵ�.
 * 
 * package �ȿ� ����� ���� ���� Ŭ������ ���������ڸ� �����ϸ� default�� �ƴ϶� public�̴�.
 */