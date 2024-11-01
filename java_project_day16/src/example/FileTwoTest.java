package example;

import java.io.FileWriter;
import java.io.IOException;
public class FileTwoTest {
	public static void main(String[]args) throws Exception{
		try (FileWriter writer = new FileWriter("test1.txt",true)){
			StringBuffer sb = new StringBuffer();
			sb.append("가장 위대한 영관은 한번도 실패하지않음이 아니라 실패할때마다 "
					+ "다시 일어서는 데 있다\n");
			writer.write(sb.toString());
			writer.flush();
			writer.close();
	//---------------------------------------------------------------	
			FileWriter writer2 = new FileWriter("test2.txt",true);
			StringBuffer sb2 = new StringBuffer();
			sb2.append("행복은 성취의 기쁨과 창조적 노력이주는 쾌감 속에 있다\n");
			sb2.append("우리가 할 수 있기 전에 배워야 하는 일들을 우리는 하면서 배운다\n");
			sb2.append("미래가 어떻게 전개 될지는 모르지만 누가 그밈래를 결정하는지는 안다");
			writer2.write(sb2.toString());
			writer2.flush();
			writer2.close();
	//---------------------------------------------------------------	
			FileWriter writer3 = new FileWriter("writer.txt",true); 
			StringBuffer sb3 = new StringBuffer();
			sb3.append(sb);
			sb3.append(sb2);
			writer3.write(sb3.toString());
			writer3.flush();
			writer3.close();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
