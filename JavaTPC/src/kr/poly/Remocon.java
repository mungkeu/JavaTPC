package kr.poly;

// 자체적으로 객체생성은 불가능하다. RemoCon r = new RemoCon(); X
public interface Remocon {
	
	// 상수는 사용이 가능하다.
	public static final int MAXCH=100; // RemoCon.MAXCH
	int MINCH=1; // public static final가 생략되어 있다.
	
	public abstract void chUp();
	// 인터페이스는 어차피 100% 추상 메서드 이기 때문에 묵시적으로 abstract가 생략되어 있다.
	public void chDown(); 
	public void internet();
	
	// 구현 메서드는 만들 수 없다.
}
