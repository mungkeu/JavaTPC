package kr.poly;

// ��ü������ ��ü������ �Ұ����ϴ�. RemoCon r = new RemoCon(); X
public interface Remocon {
	
	// ����� ����� �����ϴ�.
	public static final int MAXCH=100; // RemoCon.MAXCH
	int MINCH=1; // public static final�� �����Ǿ� �ִ�.
	
	public abstract void chUp();
	// �������̽��� ������ 100% �߻� �޼��� �̱� ������ ���������� abstract�� �����Ǿ� �ִ�.
	public void chDown(); 
	public void internet();
	
	// ���� �޼���� ���� �� ����.
}
