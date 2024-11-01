package exam_file;
import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FileExample {
	public static void main(String[]args) throws Exception {
		File dir = new File("C:/Temp3/Test/Dir"); //해당 위치 입력
		if(!dir.exists()) { //해당공간에 폴더가 없을 시 
			dir.mkdirs(); // 폴더를 생성 메서드
		}
		File file1 = new File("C:/Temp/file1.txt"); //해당위치 입력
		if(file1.exists()) { //해당위치에 file1이 있을시
			file1.delete(); //파일 삭제
		}
		File file2 = new File("file2.txt");
		if(!file2.exists()) {
			file2.createNewFile();
		}
		
		if(file2.exists()) {
			try(PrintWriter out = new PrintWriter(file2)){
				out.println("김서건 슈퍼파워 짱짱맨!");
			}
			System.out.println("파일 이름 : " + file2.getName());
			System.out.println("파일 경로 : " + file2.getPath());
			System.out.println("쓰기 가능 : " + file2.canWrite());
			System.out.println("읽기 가능 : " + file2.canRead());
			System.out.println("파일 길이 : " + file2.length() + "바이트");
			System.out.println("=====================================================");
		}
		else {
			System.out.println("작업할 파일이 존재하지 않음");
		}
		
		File temp = new File("C:/Temp");
		System.out.println("경로 : " + temp.getPath());
		System.out.println("부모 : " + temp.getParent());
		System.out.println("절대경로 : " + temp.getAbsolutePath());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a   HH:mm"); // 시간출력 메서드
		
		File[] contents = temp.listFiles();
		System.out.println("=====================================================");

		System.out.println("날짜 \t\t 시간 \t형태 \t크기 \t\t이름");
		for(File file : contents) { 	// 향상된 for 문 - 배열에 순차적으로 대입
			System.out.print(sdf.format(new Date(file.lastModified()))); // 파일의 마지막으로 수정된 날짜를 출력
			
			if(file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.print("\t" + file.length() + "\t\t" + file.getName());
            }
            System.out.println();
        }
    }
}