package kr.tpc;

// 잘 설계된 VO class
public class MemberVO {
	//------------------------------------------------------
	// 1. private으로 샛체의 상태를 보호한다.
	// 정보은닉(information hiding)
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	//-------------------------------------------------------
	// 2. 디폴트 생성자를 명시적으로 만든다.
	//    오버로딩 생성자를 만들어 적절하게 초기화한다.
	//	  - 객체를 생성하는 작업은 생성자 내부에서 JVM이 자동으로 처리한다.
	public MemberVO() {}
	public MemberVO(String name, int age, String tel, String addr)
	{
		this.name=name;
		this.age=age;
		this.tel=tel;
		this.addr=addr;
	}

	//--------------------------------------------------------
	// 3. Private으로 만들어진 멤버변수를 접근하기 위해서 setter, getter method를 만든다.
	// 		 # DI(Dependency Injection: 종속객체 주입
	//     		- setter method의 역활
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	//---------------------------------------------
	// 객체가 가지고 있는 값 전체를 출력하기 위한 toString() method를 재정의 한다.
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
}
