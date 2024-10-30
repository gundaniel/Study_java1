package exam_writer_write;

	import java.io.FileWriter;
	import java.io.Writer;

	public class WriteExample2 {
		public static void main(String[] args) {
			try(Writer writer = new FileWriter("test.txt");){
				/*StringBuffer sb = new StringBuffer();
				sb.append("신은 우리가 성공할 것을 ");
				sb.append("요구하지 않는다.\n");
				sb.append("우리가 노력할 것을 요구할 ");
				sb.append("뿐이다.(마더 테레사)");
				writer.write(sb.toString());*/
				
				// 저장할 문자열을 직접 명시해 주어도 된다
				writer.write("신은 우리가 성공할 것을 요구하지 않는다.\n우리가 노력할 것을 요구할 뿐이다.(마더 테레사)");
				System.out.println("파일 생성되었습니다.");
			}catch(Exception e) {
				System.out.println("파일 생성 및 저장에 문제가 있어 잠시 후 다시 진행해 주세요.");
			}
		}
	}

