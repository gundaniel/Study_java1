package exam_inner_interface;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
	
	
}
