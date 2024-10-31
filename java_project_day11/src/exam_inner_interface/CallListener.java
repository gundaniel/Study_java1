package exam_inner_interface;

public class CallListener implements Button.OnClickListener{ //구현 클래스
	
	@Override
	public void onClick(){
		System.out.println("전화를 겁니다");
	}

}
