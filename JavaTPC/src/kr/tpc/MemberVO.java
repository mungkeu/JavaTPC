package kr.tpc;

// �� ����� VO class
public class MemberVO {
	//------------------------------------------------------
	// 1. private���� ��ü�� ���¸� ��ȣ�Ѵ�.
	// ��������(information hiding)
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	//-------------------------------------------------------
	// 2. ����Ʈ �����ڸ� ���������� �����.
	//    �����ε� �����ڸ� ����� �����ϰ� �ʱ�ȭ�Ѵ�.
	//	  - ��ü�� �����ϴ� �۾��� ������ ���ο��� JVM�� �ڵ����� ó���Ѵ�.
	public MemberVO() {}
	public MemberVO(String name, int age, String tel, String addr)
	{
		this.name=name;
		this.age=age;
		this.tel=tel;
		this.addr=addr;
	}

	//--------------------------------------------------------
	// 3. Private���� ������� ��������� �����ϱ� ���ؼ� setter, getter method�� �����.
	// 		 # DI(Dependency Injection: ���Ӱ�ü ����
	//     		- setter method�� ��Ȱ
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
	// ��ü�� ������ �ִ� �� ��ü�� ����ϱ� ���� toString() method�� ������ �Ѵ�.
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
}