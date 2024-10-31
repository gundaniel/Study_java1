package exam_interface_example;

public class SeparateVolume implements Lendable{
	
	private String requestNo;
	private String bookTitle;
	private String writer;
	private String borrower;
	private String checkOutDate;
	private int state;

	
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	public void checkOut(String borrower, String date) {
		if(state != 0)
			return;
		this.borrower = borrower;
		checkOutDate = date;
		this.state = 1; //대출상태
		
		System.out.println("*" + bookTitle + "(" + writer + ")이(가) 대출되었습니다.");
		System.out.println("대출인 : " + this.borrower);
		System.out.println("대출일 : " + this.checkOutDate);
	}
	
	public void checkIn() {
		if (state == 0) {
		System.out.println("이미 반납처리가 완료되었습니다.");
		return;
		}
	this.borrower = null;
    this.checkOutDate = null;
    this.state = 0; //반납상태
    System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
	}
	
	//출력문
	public String toString(){
    	return "단행본 정보[ 청구번호 : "+ requestNo + ", 책제목 : "+ bookTitle + ", 저자 : "+writer +"]";
    }

	//접근자 설정자
	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	
}
