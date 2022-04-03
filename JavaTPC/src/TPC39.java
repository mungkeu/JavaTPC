import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC39 {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList(); // Object[]
		List<BookDTO> list = new ArrayList<BookDTO>(); // Object[] -->BookDTO[]
		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C언어", 17000, "에이콘", 700));
		list.add(new BookDTO("Python", 15000, "제이펍", 690));
		
		for(int i=0; i<list.size(); i++)
		{
			//Object o = list.get(i);
			//BookDTO vo = (BookDTO)o;
			BookDTO vo = list.get(i); // 제네릭을 사용해 이제는 다운 캐스팅이 필요없다.
			System.out.println(vo.title+"\t"+vo.price+"\t"+vo.company+"\t"+vo.page);
		}
	}

}
