
public class TPC30 {

	public static void main(String[] args) {
		

	}

}

/*
 * 1. �������̽��� �������̽��� ��Ӱ���
 * 
 * <<A>>  public void m()                           public interface A{public void m();}----------------
 *   ^          																						|
 *   | extends																							|
 * <<B>>  public void z();                          public interface B extends A{public void z();}------|
 *   ^																									|
 *   | extends																							|
 *   X    public class X implements B																	|
 * 		  {																								|
 * 			public void m(){}<--------------------------------------------------------------------------|
 * 			public void z(){}<--------------------------------------------------------------------------|
 * 		  }								�ݵ�� override�� �ؾ� �Ѵ�. (�������� ����ȴ�.)
 * 
 * 
 * 
 * 2. ���߻�Ӱ��迡 �ִ� Ŭ���� ����
 * 
 * abstract class          interface           interface
 *     Animal               <<Pet>>            <<Robots>>
 *       ^					   ^ 				    ^
 *       |                     |                    |             ---->       public class Dog extends Animal implements Pet, Robots
 *       --------------------------------------------						  { }
 *                             |
 *                            Dog 
 * Dog Ŭ������ Animal Ŭ������ ����߰�, pet�� Robots ����� �����ߴ�.
 */