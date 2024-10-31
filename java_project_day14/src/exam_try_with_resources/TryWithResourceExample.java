package exam_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		// try-with-resources
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			//throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
		System.out.println();
		
		// try ~ catch ~ finally
		
//--------------------------------------------------------------
	 FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
			fis.read();
		} 
		catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		} 
		finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(Exception ex) {
				System.out.println("해제시 오류");
			}
		}
	}
}
