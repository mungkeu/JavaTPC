package kr.bit; // src 폴더 안에 kr 폴던 안에 bit 폴더안의 Book 클래스파일.

// 책 (객체) : 제목, 가격, 출판사, 페이지수 (상태정보) + (행위정보:동작=메서드)
// Book Class => 설계도
// ㅁㅁㅁㅁ -> 기억공간 4개에 각각의 상태정보를 저장하고 있다.
public class Book {
	public String title;
	public int price;
	public String company;
	public int page;
}