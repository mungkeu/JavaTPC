
public class TPC09 {

	public static void main(String[] args) {
			int a=56;
			int b=40;
			
			TPC09 tpc = new TPC09(); // static이 아닌 메서드를 메모리에 올리기 위해서 강제 객체 생성
			int v = tpc.sum(a, b);
			System.out.println(v);
	}
	public int sum(int a, int b)
	{
		int v = a+b;
		return v;
	}
}


/*
 * JVM의 4가지 메모리 영역
 * 		method Area      		  				stack Area     					     heap Area      				literal Pool
 *      
 *      static zone
 *        main 1.																TPC08 tpc = new TPC08()
 *                    							 call 			pointer		TPC08
 *   -------------------------------------------------------------------   ㅡㅡㅡㅡㅡㅡㅡ> add
 *   |  non-static zone    						3.                       |
 *   ->    add(byte code)------------------------> add(a:10,b:20,sum:30) |
 *      4.            								ㅅ                    2. int v=tpc.add(a,b);
 *													|					 |
 *											 	  main                   |
 *											ㅁ:a   ㅁ:b   ㅁ:v   ㅁ:tcp-----                                               
 *       
 */