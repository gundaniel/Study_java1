package exam_class;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListExample {
	public static void main(String[]args) {
		
		//심사위원의 점수 출력 프로그램
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		double value = 0.0;
		while(!false){
			System.out.printf("(%d번째) 심사위원의 점수: ", i);
			value = input.nextDouble();
			if(value < 0 || value > 10) {
				continue;
			}
			list.add(value);
			i++;
			if(i>10) break;
		}
		  // 처리단계 및 출력
        double max = Collections.max(list); // max(list);
        double min = Collections.min(list); // min (list);
        double sum = 0.0;
        double collValue = 0.0;

        for(int j = 0; j < 10; j++){
            collValue = list.get(j);
            if( collValue != min && collValue != max ) {
                sum += collValue;
            }
        }
        System.out.printf("점수의 합: %.1f", sum);

        input.close();
    }
}