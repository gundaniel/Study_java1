package exam_interface_example;

public class BookCDMS {
	public static void main(String[]args) {
		
	
		SeparateVolume sv = new SeparateVolume("863774", "엄마를 부탁해", "신경숙");
	    sv.checkOut("홍길동", "20240125");  
	    sv.checkIn();
	    sv.checkIn();

		AppCDInfo ac =new AppCDInfo("82973315", "비의 아이");
	    ac.checkOut("김서건","0108973315");
	    ac.checkOut("김서건","0108973315");
	    ac.checkIn();
	    ac.checkIn();

	    MusicCDInfo music = new MusicCDInfo("1", "동행", "김동률", new String[] {"고백","청춘","내 사람"});
	    System.out.println(music.toString());
	   
	}
	    
}

