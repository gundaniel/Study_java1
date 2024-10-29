package exam_class;

public class ThreeDprinter {// <>는 제네릭 클래스를 의미 
	public static void main(String[]args) {
	
	String tx = "홍길동,이수홍,김연수,김자바";
	String[] name = tx.split(",");
	
	String ty  = "홍길동&이수홍&김연수&김자바";
	String[] name2 = ty.split("&");
	
	
	for(int i = 0; i < name.length; i++) {
		System.out.println(name[i]);
	}
	System.out.println();
	}
}
