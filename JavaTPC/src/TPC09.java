
public class TPC09 {

	public static void main(String[] args) {
			int a=56;
			int b=40;
			
			TPC09 tpc = new TPC09(); // static�� �ƴ� �޼��带 �޸𸮿� �ø��� ���ؼ� ���� ��ü ����
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
 * JVM�� 4���� �޸� ����
 * 		method Area      		  				stack Area     					     heap Area      				literal Pool
 *      
 *      static zone
 *        main 1.																TPC08 tpc = new TPC08()
 *                    							 call 			pointer		TPC08
 *   -------------------------------------------------------------------   �ѤѤѤѤѤѤ�> add
 *   |  non-static zone    						3.                       |
 *   ->    add(byte code)------------------------> add(a:10,b:20,sum:30) |
 *      4.            								��                    2. int v=tpc.add(a,b);
 *													|					 |
 *											 	  main                   |
 *											��:a   ��:b   ��:v   ��:tcp-----                                               
 *       
 */