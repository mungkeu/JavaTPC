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
		
		// 영화(제목, 가격, 주인공, 등급, 시간)
		MovieVO mv = new MovieVO("비트", 12000, "연기자", 12, 1.3f);
		System.out.println(mv.toString());
		
		// 영화 3편을 저장
		MovieVO[] marr= new MovieVO[3];
		marr[0] = new MovieVO("비트1", 11000, "연기자1", 11, 1.3f);
		marr[1] = new MovieVO("비트2", 12000, "연기자2", 12, 1.4f);
		marr[2] = new MovieVO("비트3", 13000, "연기자3", 13, 1.5f);
		
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
 * 동일한 구조 VS 이질적인 구조 
 *
 * 1. 배열 VS 클래스의 관계
 * 	기본 자료형				         구조의 이름 : int[]
 * int[] arr = new int[5] ->  ㅁ       ㅁ      ㅁ      ㅁ      ㅁ      -> Array  
 *              정수 5개.     arr[0]  arr[1]  arr[2]  arr[3]  arr[4]    동일한 구조
 * 
 * 
 * 
 *  새롭게 클래스 설겨                             구조의 이름 : MovieVO
 *  MovieVO vo = new MovieVO(); ->   ㅁ     ㅁ     ㅁ     ㅁ     ㅁ    -> Class
 *  							    title price author level  time     서로 다른(이질적인) 한 데이터 구조
 *                           
 *  MovieVO[] vo = new MovieVO[5];   
 *  
 *  
 *   ㅁ     ㅁㅁㅁㅁ
 *  vo[0] vo[1] vo[2] vo[3] vo[4] 
 *  
 *  각 vo의 구조 ex) vo[2]
 *  MovieVO							
 *  ㅁ     ㅁ     ㅁ     ㅁ     ㅁ
 *  title price author level  time
 */