// import java.lang.*;

public class TPC35 {

	public static void main(String[] args) {
		
		java.lang.String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v);
		System.out.println(str.charAt(3)); 		// 3������ ��ġ�� �ܾ�1�� 
		System.out.println(str.length());		// ���ڿ��� ����
		System.out.println(str.indexOf("PL"));	// PL�̶�� ���ڰ� ���°�� �ִ���
		System.out.println(str.indexOf("PX"));	// ��ġ�ϴ°� ������ -1��ȯ
		System.out.println(str.replaceAll("P", "X")); // AXXLE, P�� X�� �ٲ۴�.
	}

}

/*
 * Java API �����ϱ� (JAVA API : 2�ܰ� package�� �����ȴ�.)
 * Java API �߿��� String Class�� �����ϴ� ���
 * 
 * src ------------jrt-fs.jar
 *  |					|
 *  �ѤѤ�TPC35			�Ѥ� java (package)
 *        |                  |
 *        |                  �Ѥ� lang (String...)
 *        |                  |
 *        |                  �Ѥ� util (ArrayList...)
 *        |                  |
 *        |                  �Ѥ� io
 *        |                  |
 *        |                  �Ѥ� sql
 *        |					 |
 *        |					 �Ѥ� net
 *        | 					  ^
 *        |                       |
 *        |�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�---|   
 *        
 * String Ŭ������ �̸��� 2�����̴�.
 * �⺻�̸� : String
 * ��Ű���� ������ �̸�*class full name) : java.lang.String
 * 
 * java.lang package�� ����Ʈ package�� Ŭ������ ����� �ڵ�����
 * import�ȴ�.
 * import java.lang.*
 */