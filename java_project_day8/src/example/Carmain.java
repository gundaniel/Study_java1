package example;

public class Carmain {
	public static void main(String[]args) {
		
	
		 //배열로 출력을 작성
		Monata [] monata = {
			new Monata("흰색",5000,"NF","승용"),
			new Monata("은색",7000,"Brilliant","업무"),
			new Monata("감홍색",4000,"EF","택시"),
			new Monata("검정색",6000,"Hybrid","승용")
		};
		
		System.out.println("============================= Monata 생산시작 ============================");
		for(int i = 0; i < monata.length; i++) {
		System.out.println(monata[i].toString());
		}
		System.out.println("============================= Monata 생산종료 ============================");
		
		
	}
}
