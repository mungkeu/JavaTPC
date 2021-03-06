import kr.tpc.Inflearn;

public class TPC13 {

	public static void main(String[] args) {

		// Inflearn inf = new Inflearn(); //private 생성자.
		Inflearn.tpc();
		Inflearn.java();
		
		// Java API 생성자 private
		System.out.println("static 메서드");
		int v = Math.max(10, 20);
		System.out.println(v);
	}

}

/*
 * private 생성자 메서드(Constructor)
 * - 객체생성에 관여하는 생성자 메서드가 private 접근제어를 가지면 객체를 생성(new)할 수 없다.
 * 
 * non-static 멤버인 경우(인스턴스 메서드) ex) public void tpc()
 * - 객체생성 후 접근 가능
 * 
 * static 멤버인 경우(클래스 메서드)  ex) public static void java()
 * 객체생성 없이 접근가능(클래스 이름으로 접근)
 * 
 * - static은 static 존에 static main 메서드와 함께 자동으로 올라간다.
 * - 클래스를 사용하는 시점에서 static 멤버는 먼저 자동으로 메모리에 로딩이 된다.
 *   그 이후에 호출이 된다.
 * - 모든 메서드가 static이면 생성자가 굳이 필요없어 private으로 사용한다.
 */