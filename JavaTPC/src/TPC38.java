import java.util.ArrayList;

import kr.infrine.ObjectArray;
import kr.tpc.A;
import kr.tpc.B;

public class TPC38 {

	public static void main(String[] args) {
		//ObjectArray arr = new ObjectArray(5);
		ArrayList arr = new ArrayList(5); // Object[], 배열의 길이에 제약이 없다.
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		arr.add(new B());
		arr.add(new B());

	
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i) instanceof A)
			{
				((A)arr.get(i)).go();
			}else {
				((B)arr.get(i)).go();
			}
		}
	}

}
