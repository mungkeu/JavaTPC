
public class TPC30 {

	public static void main(String[] args) {
		

	}

}

/*
 * 1. 인터페이스와 인터페이스의 상속관계
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
 * 		  }								반드시 override를 해야 한다. (다형성이 보장된다.)
 * 
 * 
 * 
 * 2. 다중상속관계에 있는 클래스 구조
 * 
 * abstract class          interface           interface
 *     Animal               <<Pet>>            <<Robots>>
 *       ^					   ^ 				    ^
 *       |                     |                    |             ---->       public class Dog extends Animal implements Pet, Robots
 *       --------------------------------------------						  { }
 *                             |
 *                            Dog 
 * Dog 클래스는 Animal 클래스를 상속했고, pet과 Robots 기능을 구현했다.
 */