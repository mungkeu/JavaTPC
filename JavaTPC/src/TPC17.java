import kr.tpc.OverLoad;

public class TPC17 {

	public static void main(String[] args) {
		OverLoad ov = new OverLoad();
		
		ov.hap(20, 50);
		ov.hap(23.4f, 56);
		ov.hap(56.7f, 78.9f);
	}

}
/*
 * 메서드 오버로딩(Method Overloading)
 * - 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
 * - 메서드의 signature가 다르면 된다.
 * - signature : 매개변수의 타입, 개수
 * 
 * 컴파일러가 만들어내는 메서드의 이름
 * 
 * hap_int_int(int a, int b)
 * hap_float_int(float a, int b)
 * hap_float_float(float a, float b)
 * 
 * 오버로딩(Overloading)
 * - 정적 바인딩(컴파일 시점에서 호출될 메서드가 이미 결정되어 있는 바인딩)
 * - 속도와는 관계가 없다.
 * - 즉, 컴파일 이후인 실행시에는 이미 다 정해져 있어 속도와 상관없음.
 */