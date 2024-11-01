package exam_class;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class FlieExample {
	public static void main(String []args) throws Exception {
		
		Writer fw = null;
		BufferedReader br = null;
		Writer ofw = null;
		Random r = new Random();
		
		try {
			//1. input.txt 파일 생성
			// 문자기반 출력 스트림 생성
			fw = new FileWriter("input.txt"); //파일생성
			for(int i = 0; i < 10; i++) {  //10번 반복
				fw.write(String.valueOf(r.nextInt(300))); //랜던한 숫자를 문자열로 반환
				fw.write("\r\n");
			}
			fw.flush(); //남은 데이터를 비움
			
			// 2. input 파일을 읽어 ArrayList에 저장하여 오름차순으로 정렬
			ArrayList<Integer> list = new ArrayList<Integer>();
			br = new BufferedReader(new FileReader("input.txt"));
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				int value = Integer.parseInt(line);
				list.add(value);
			}
			Collections.sort(list);
			
			//3. output.txt 파일 생성
			ofw = new FileWriter("output.txt");
			for(int k = 0; k <list.size(); k++) {
				ofw.write(String.valueOf(list.get(k)));
				ofw.write("\r\n");
			}
			ofw.flush();
			
			System.out.println("파일에 정상적으로 복사되었습니다.");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fw != null) {fw.close();}
				if(br != null) {br.close();}
				if(ofw != null) {ofw.close();}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
	