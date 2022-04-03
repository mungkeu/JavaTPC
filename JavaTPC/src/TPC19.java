import java.lang.*;  // ����Ʈ ��Ű��(����)

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtill;

public class TPC19 {

	public static void main(String[] args) {
		// 1. Java���� �������ִ� class��... API
		// ���ڿ�(Sting)                          str      string (APPLE)
		java.lang.String str = new String("APPLE");  //    �� ----> ����������
		System.out.println(str.toLowerCase());
		
		// 2. ���� ���� ����ϴ� class��.... DTO/VO/, DAO, Utility .. API
		MyUtill my = new kr.tpc.MyUtill();
		int sum=my.hap();
		System.out.println(sum);
		
		// 3. �ٸ� ȸ�翡�� ����� ���� class... API
		// Gson -> json : https://mvnrepository.com/
		// ������ ���� �� �߰��Ҷ��� ������Ʈ ��Ŭ�� -> Build Path-> Configure Build Path -> 
		// Libraries -> Class Path Ŭ�� -> Add External JARs... Ŭ�� -> ������ ���� �������� �ش� JAR���� �� �����´�.
		Gson g = new Gson();
		BookVO vo = new BookVO("�ڹ�", 13000, "����", 800);
		String json = g.toJson(vo);
		// {"title":"�ڹ�","price":13000,"company":"����","page":800} JSON ������ �ٲ�, ��ü�� ���ڿ��� ���·� �ٲ�, Ű �� ����.
		System.out.println(json);
	}

}

/*
 * Part-1 �н�����
 * 
 * class - DataType ���� : ���ο� �ڷ����� �����(�����ϴ�) ���� = �𵨸� ����
 * OOP(��ü����) ���� : ��ü�� ���������� ���������� �����Ͽ� ĸ��ȭ �ϴ� ����
 * 
 * Model : class�� Model�̶�� �θ���. (������ �������Ƿ�)
 * 
 * �츮�� ����� Model�� ���� (3������ ���� ��κ� ����� �Ǿ��ִ�.)
 * 1-1. DTO(Data Transfer Object)
 * - ������ ����, �����͸� ��� ����, �̵��ϱ� ���ؼ� �����͸� ��´�.
 * 1-2	VO(Value Object)
 * - ��ü�� ��Ƽ� �ϳ��� ��(���)���� ����Ѵٴ� �ǹ̴�.
 * 2. DAO(Data Access Object)
 * - �����͸� ó���ϴ� ����(����Ͻ� ����), �����ͺ��̽��� CRUD�ϴ� ����
 * 3. Utility(Helper Object)
 * - ������ �ִ� ����� �����ϴ� ����(��¥, �ð�, ��ȭ, ���ڵ� ��)
 * 
 * �츮�� ������ ����ϰ� �� Ŭ������
 * - API(Application Programming Interface) -> MVNREPOSITORY -> ����� jar������ �ٿ�޾� ���.
 * 1. Java���� �������ִ� class��
 * - String, System, Integer, ArrayList, Map ��
 * 2. ����� ����ϴ� class ��(DTO, DAO, Utility)
 * 3. 1, 2���� �ƴ� �ٸ� ����� ���� �������ִ� class��
 * - Gson, Jsoup, POI, iText ��
 */