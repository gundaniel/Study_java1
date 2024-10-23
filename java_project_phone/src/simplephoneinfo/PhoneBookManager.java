package simplephoneinfo;
public class PhoneBookManager {

		private static final int MAX_CNT = 100;
		private PhoneInfo[] infoStorage;
		private int curCnt;
		
	
	public PhoneBookManager() {
		curCnt = 0;
		infoStorage = new PhoneInfo[MAX_CNT];
	}
	//-------------------------------------------------------------- // 입력 메서드 작성
	public void inputData() {
		System.out.println("데이터입력을 시작합니다");
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("생년월일 : ");
		String birthday = MenuViewer.keyboard.nextLine();
		
		infoStorage[curCnt++] = new PhoneInfo(name, phone, birthday);
		System.out.println("데이터 입력이 완료되었습니다 \n");
	}
	//-------------------------------------------------------------- // 검색 메서드 작성
	public void searchData() {
		System.out.println("데이터 검색을 시작합니다");
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}
		else {
			infoStorage[dataIdx].showPhoneInfo();
		}
	}
	//-------------------------------------------------------------- // 삭제 메서드 작성
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다");
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx <0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}
		else {
			for(int idx = dataIdx; idx < (curCnt -1); idx++) { // 
				infoStorage[idx] = infoStorage[idx+1]; 				 //삭제할 경우 비어있는인덱스를 뒤에 인덱스 값이 체움
			}
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다.");
		}
	}
	//-------------------------------------------------------------- 
	private int search(String name) {
		for(int idx = 0; idx < curCnt; idx++) {
			PhoneInfo curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.getName()) == 0) {
				return idx;
			}
		}
		return -1;
	
	}
}
		