package exam_class_array;

public class SmartPhoneTest {
	public static void main(String[]args) {
					
		SmartPhone[] sp = {
			new SmartPhone("삼성","갤럭시노트20",1594500, 0),
			new SmartPhone("애플","아이폰14",1364000, 10),
			new SmartPhone("삼성","갤럭시S24",1800000, 25)
		};
		
		double rate;
		double[] rate1 = {0.10,0.25};	
		
		System.out.println("=======제품목록=========");
		System.out.println("----------------------");
		for(int i = 0; i < sp.length; i++) {
			sp[i].phoneData();	
			if(sp[i].getDiscountRate() != 0) {
					rate =(sp[i].getPrice() - (sp[i].getPrice() * rate1[i-1]));
					System.out.format("할인가격(%.0f%%):%,d\n",(rate1[i-1] * 100) ,(int)rate);
				}System.out.println("----------------------");
			}
		}
			
	}		



