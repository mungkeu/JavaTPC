package kr.infrine;

public class IntArray {
	private int count;
	private int[] arr;
	public IntArray() {
		this(10); // 매개변수로 int 1개를 받는 다른 생성자에게 넘겨준다.
	}
	
	public IntArray(int init) {
		arr=new int[init];
	}
	
	public void add(int data)
	{
		arr[count++] = data;
	}
	
	public int get(int index)
	{
		return arr[index];
	}
	
	public int size()
	{
		return count;
	}
}
