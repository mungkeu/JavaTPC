package kr.poly;

public class TV implements Remocon{

	int currCH=70;
	@Override
	public void chUp() {
		if(currCH<Remocon.MAXCH)
		{
			currCH++;
			System.out.println("TV�� ä���� �ö󰣴�."+currCH);
		} else {
			currCH=1;
			System.out.println("TV�� ä���� �ö󰣴�."+currCH);
		}
	}

	@Override
	public void chDown() {
		if(currCH>Remocon.MINCH) {
			currCH--;
			System.out.println("TV�� ä���� ��������."+currCH);
		}else {
			currCH=100;
			System.out.println("TV�� ä���� ��������."+currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("���ͳ��� �ȴ�.");
		
	}
	
	// TV�� �������� ����� �ִٸ� ���� �����.
}
