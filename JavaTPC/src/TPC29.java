import kr.tpc.*;
public class TPC29 {

	public static void main(String[] args) {
		// Oracle, MySQL -> Driver class
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "bit", "12345");
		
		conn = new JavaMySQL();
		conn.getConnection("url", "bit", "12345");
	}

}

/*
 * �������̽�(�Ծ�)�� JDBC�� ����
 * 
 * JAVA
 * - java���� JDBC ���α׷����� �ϱ� ���ؼ���
 *   �������� �����ϴ� Ŭ������ �̿��ؾ� �Ѵ�.
 *   
 * - �������� �����ϴ� Ŭ������ ���ϵǾ� ���� ������
 *   ��� �����ͺ��̽��� ������ �˰� �־�� JDBC
 *   ���α׷����� �����ϴٴ� �ǹ��̰� �̴� �Ұ����ϴ�.
 *   
 *   Oracle         	  My-SQL           		MS-SQL
 * class JavaOracle     class JavaMySQL       class JavaMsSql
 * {					{					  {
 *   oracleConnect()      mysqlConnect()        mssqlConnect()
 * }  					}					  }
 * 
 * - ���� ���� �����ͺ��̽� ���ӹ��, CRUD ���۹�� ���� �ٸ���.
 * 
 * �׷��⿡ �Ʒ��� ���� ����Ѵ�.
 *                                                                     getConnection(url, id, pwd);
 *                    ����Ŭ����(�θ�)         implements                     ����Ŭ����(�ڽ�)
 * Java ������ -------> �������̽� -------------------------------------- ���� Ŭ������ ����� �Ѵ�.(Driver class)
 *                    Java.sql.*                                         ���ϵ� �޼��� �̸� ���(���� ������ ���ʿ䰡 ����.)
 *                public interface Connection
 *                {
 *                	getConnection(String url,         -------------->   Oracle       MySQL      MSSQL  ---> �� ���� ���� ����� �������̽��� �°� �����ؾ��Ѵ�.
 *                     String user, String passwd);                     Driver       Driver     Driver
 *                }
 *  
 *  �� ������ JDBC����̹��� ������ �ȴ�.
 */