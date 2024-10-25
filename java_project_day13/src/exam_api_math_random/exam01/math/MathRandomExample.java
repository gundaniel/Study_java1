package exam_api_math_random.exam01.math;
import java.util.Random;
public class MathRandomExample {
	public static void main(String[]args) {
		int num = (int) (Math.random()*6) +1;
		System.out.println("주사위 수: "+ num);
		
		Random random = new Random(); //자바 내에 있는 "random" 유틸을 사용
		System.out.println("주사위 수: " + (random.nextInt(6)+1));
		
		
	}
}
