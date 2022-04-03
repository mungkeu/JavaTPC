import kr.tpc.MovieVO;

public class TPC18 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int[] b= {10,20,30,40,50};
		
		int[] c=new int[] {10,20,30,40,50};
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		// ��ȭ(����, ����, ���ΰ�, ���, �ð�)
		MovieVO mv = new MovieVO("��Ʈ", 12000, "������", 12, 1.3f);
		System.out.println(mv.toString());
		
		// ��ȭ 3���� ����
		MovieVO[] marr= new MovieVO[3];
		marr[0] = new MovieVO("��Ʈ1", 11000, "������1", 11, 1.3f);
		marr[1] = new MovieVO("��Ʈ2", 12000, "������2", 12, 1.4f);
		marr[2] = new MovieVO("��Ʈ3", 13000, "������3", 13, 1.5f);
		
		System.out.println(marr[0].toString());
		System.out.println(marr[1]);
		System.out.println(marr[2]);
		
		for(int i=0; i<marr.length; i++)
		{
			System.out.println(marr[i]);
		}
	}

}
/*
 * ������ ���� VS �������� ���� 
 *
 * 1. �迭 VS Ŭ������ ����
 * 	�⺻ �ڷ���				         ������ �̸� : int[]
 * int[] arr = new int[5] ->  ��       ��      ��      ��      ��      -> Array  
 *              ���� 5��.     arr[0]  arr[1]  arr[2]  arr[3]  arr[4]    ������ ����
 * 
 * 
 * 
 *  ���Ӱ� Ŭ���� ����                             ������ �̸� : MovieVO
 *  MovieVO vo = new MovieVO(); ->   ��     ��     ��     ��     ��    -> Class
 *  							    title price author level  time     ���� �ٸ�(��������) �� ������ ����
 *                           
 *  MovieVO[] vo = new MovieVO[5];   
 *  
 *  
 *   ��     ��������
 *  vo[0] vo[1] vo[2] vo[3] vo[4] 
 *  
 *  �� vo�� ���� ex) vo[2]
 *  MovieVO							
 *  ��     ��     ��     ��     ��
 *  title price author level  time
 */