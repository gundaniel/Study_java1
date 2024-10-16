package exam_class_basic;

public class Book {

	
	public String title;    // 그대들, 어떻게 살것인가
	public String writer;   // 요시노 겐자부로
	public int price; 		// 10,800원
	public String genre;	// 교양인문
	
	public void bookData(String t, String w, int p, String g) {
		title = t;
		writer = w;
		price = p;
		genre = g;
	}
	
	public void printData() {
		System.out.format("제목:%s\n작가:%s\n가격:%,d\n장르:%s",title ,writer ,price ,genre);
	}
	
	public String toString() {
		return "제목:" + title  + "\n작가:"+ writer + "\n가격:" + price + "\n장르:" + genre;
	}

}
