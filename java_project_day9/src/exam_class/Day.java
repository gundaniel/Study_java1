package exam_class;

	public class Day {
		private String work; // 하루의 할 일을 나타내는 문자열
		
		//설정자
		public void set(String work) { 
			this.work = work; 
		}
		//접근자
		public String get() { 
			return work; 
		}
		
		//출력
		public void show() {
			if(work == null) {
				System.out.println("없습니다.");
			} else {
				System.out.println(work + "입니다.");
			}
		}
}

