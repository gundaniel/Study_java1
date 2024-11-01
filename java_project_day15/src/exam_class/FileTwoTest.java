package exam_class;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FileTwoTest {
	//텍스트 2개를 읽어와서 새로운텍스트에 저장하는 구문 작성
	
	/*public static void main(String[] args) {
	        BufferedReader br1 = null;
	        BufferedReader br2 = null;
	        FileWriter fw = null;
	        try {
	            br1 = new BufferedReader(new FileReader("test.txt"));
	            br2 = new BufferedReader(new FileReader("result.txt"));

	            fw = new FileWriter("writer.txt");
	            while (true) {
	                String line = br1.readLine();
	                if (line == null)
	                    break;
	                fw.write(line+"\n");
	            }
	            while (true) {
	                String line = br2.readLine();
	                if (line == null)
	                    break;
	                fw.write(line+"\n");
	            }
	            fw.flush();
	            System.out.println("파일 복사 완료.");
	        } catch (IOException io) {
	            io.printStackTrace();
	        }finally{
	            try {
	                if(fw!=null) fw.close();
	                if(br2!=null) br2.close();
	                if(br1!=null) br1.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    */
	
	public static void main(String[]args){
		try(BufferedReader br1 = new BufferedReader(new FileReader("test1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("result.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter("writer.txt"));) //)닫음으로 해제처리
		{
			while (true) {
				String line = br1.readLine(); //문자열을 스트링으로 읽어옴
				if(line == null)
					break;
				pw.println(line);
			}
			while (true) {
				String line = br2.readLine();
				if(line == null)
					break;
				pw.println(line);
			}
			pw.flush();
			System.out.println("파일 복사 완료");
			
		}
		catch(IOException io) {
			io.printStackTrace();
		}	
	}
}
	
	

