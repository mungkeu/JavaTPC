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
 * 인터페이스(규약)와 JDBC의 관계
 * 
 * JAVA
 * - java에서 JDBC 프로그래밍을 하기 위해서는
 *   벤더에서 제공하는 클래스를 이용해야 한다.
 *   
 * - 벤더에서 제공하는 클래스가 통일되어 있지 않으면
 *   모든 데이터베이스의 동작을 알고 있어야 JDBC
 *   프로그래밍이 가능하다는 의미이고 이는 불가능하다.
 *   
 *   Oracle         	  My-SQL           		MS-SQL
 * class JavaOracle     class JavaMySQL       class JavaMsSql
 * {					{					  {
 *   oracleConnect()      mysqlConnect()        mssqlConnect()
 * }  					}					  }
 * 
 * - 벤더 별로 데이터베이스 접속방법, CRUD 동작방법 등이 다르다.
 * 
 * 그렇기에 아래와 같이 사용한다.
 *                                                                     getConnection(url, id, pwd);
 *                    상위클래스(부모)         implements                     하위클래스(자식)
 * Java 개발자 -------> 인터페이스 -------------------------------------- 구현 클래스를 만들게 한다.(Driver class)
 *                    Java.sql.*                                         통일된 메서드 이름 사용(구현 내용은 알필요가 없다.)
 *                public interface Connection
 *                {
 *                	getConnection(String url,         -------------->   Oracle       MySQL      MSSQL  ---> 즉 이제 접속 방법을 인터페이스에 맞게 구현해야한다.
 *                     String user, String passwd);                     Driver       Driver     Driver
 *                }
 *  
 *  각 벤더별 JDBC드라이버만 받으면 된다.
 */