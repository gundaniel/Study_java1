package example;

public class Carmain {
	public static void main(String[]args) {
		
		
		String[] color = new String[]{"흰색","은색","감홍색","검정색"};
		int[] account = new int[]{5000,7000,4000,6000};
		String[] md = new String[] {"NF","Brilliant","EF","Hybrid"};
		String[] use = new String[] {"승용","업무","택시","승용"};
		
		
		/*Monata mt1 = new Monata("흰색",5000,"NF","승용");
		Monata mt2 = new Monata("은색",7000,"Brilliant","업무");
		Monata mt3 = new Monata("감홍색",4000,"EF","택시");
		Monata mt4 = new Monata("검정색",6000,"Hybrid","승용");
*/
		
		System.out.println("/n============================= Monata 생산시작 ============================");
		for(int i = 0; i <color.length; i++) {
			System.out.printf("[색상] %-10s[생산수량] %-10d[용도] %-10s[모델] %-10s\n", color[i], account[i], use[i], md[i]);
		}
		
		
		//System.out.println("============================= Monata 생산시작 ============================");
		//System.out.println(mt1.toString());
		//System.out.println(mt2.toString());
		//System.out.println(mt3.toString());
		//System.out.println(mt4.toString());
		//System.out.println("============================= Monata 생산종료 ============================");
		
		
	}
}
