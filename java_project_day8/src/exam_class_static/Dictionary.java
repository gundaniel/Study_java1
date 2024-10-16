package exam_class_static;
public class Dictionary {

	// 배열에 값을 더 추가해도 됩니다	
		private static String [] kor;
		private static String [] eng; 
		
		static {
			kor = new String[]{ "사랑", "아기", "돈", "미래", "희망" };
			eng = new String[]{ "love", "baby", "money", "future", "hope" };
		}

		public static String[] getKor() {
			return kor;
		}
		public static void setKor(String[] kor) {
			Dictionary.kor = kor;
		}

		public static String[] getEng() {
			return eng;
		}
		public static void setEng(String[] eng) {
			Dictionary.eng = eng;
		}

		
		//출력메서드 생성
		public static String stringInput(String search){
			
				for(int i = 0; i < kor.length; i++) {
					if (kor[i].equals(search))
					return eng[i];
				}
				return null;
		}			
}			
	

		

	
		
		



