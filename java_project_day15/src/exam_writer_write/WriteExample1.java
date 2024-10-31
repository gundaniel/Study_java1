package exam_writer_write;

import java.io.FileWriter;
import java.io.Writer;
public class WriteExample1 {
	public static void main(String []args) throws Exception {
		Writer writer = new FileWriter("test.txt",true);
		char[] data = "오늘 하루도 최선을 다해".toCharArray();
		
		for(int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		//-----------------------------------------------------------
		//StringBuffer를 이용한 출력 (append를 사용하여 이어붙임)
		StringBuffer sb = new StringBuffer();
		sb.append("꿈을 이루지 못한 사람들은 \n");
		sb.append("나는 재능이 없었어 라고 말한다\n");
		sb.append("꿈을 이루지 못한 이유가 재능이 없었다는 것이라면 \n");
		sb.append("꿈을 이룬 사람들은 모두 재능이 있었다 라고 대답하는 것이 맞겠지만\n");
		sb.append("성공한 사람중에 그럼 대답을 하는 사람은 거의 없었다는 것이다 \n");
		sb.append("꿈을 이룬 사람들은 정말로 하고싶었던 일을 열정을 가지고 계속 했을 뿐이다.\n");
			
		writer.write(sb.toString());

		//-----------------------------------------------------------
		// 메시지 블록을 이용한 출력 
		String value = """
				꿈을 이루지 못한 사람들은
				나는 재능이 없었어 라고 말한다
				꿈을 이루지 못한 이유가 재능이 없었다는 것이라면
				꿈을 이룬 사람들은 모두 재능이 있었다 라고 대답하는 것이 맞겠지만
				성공한 사람중에 그럼 대답을 하는 사람은 거의 없었다는 것이다.
				꿈을 이룬 사람들은 정말로 하고싶었던 일을 열정을 가지고 계속 했을 뿐이다.
				""";
		writer.write(value);
		
		System.out.println("파일 출력완료");
		writer.flush();
		writer.close();
	}
	
}
