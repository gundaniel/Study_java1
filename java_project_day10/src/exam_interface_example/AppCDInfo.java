package exam_interface_example;

public class AppCDInfo extends CDInfo implements Lendable {
	
		private String checkOutDate;
		private int state;
		private String borrower;
	
	public AppCDInfo(String registerNo, String title) {
		super(registerNo,title);
	}
	
	public void checkOut(String borrower, String date) {
		if(state != 0) {
			System.out.println("현재대여중");
			return;
		}
		this.borrower = borrower;
		checkOutDate = date;
		this.state = 1; //대출상태
		
		System.out.println("*" + getTitle() + ")이(가) 대출되었습니다.");
		System.out.println("대출인 : " + this.borrower);
		System.out.println("대출일 : " + this.checkOutDate + "\n");
	}
	
	public void checkIn() {
		if (state == 0) {
		System.out.println("이미 반납처리가 완료되었습니다.");
		return;
		}
	}

}
