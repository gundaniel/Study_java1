package phoneinfoproject;
import simplephoneinfo.MenuViewer;
public class PhoneBookManager {
    private static final int MAX_CNT = 100;
    PhoneInfo[] infoStorage; // 부모 클래스의 타입으로 객체 배열 선언
    int curCnt;
	
	 public PhoneBookManager(){
		curCnt = 0;
		infoStorage = new PhoneInfo[MAX_CNT];
	}
	 //==========================================================
    // 일반을 선택했을 때 호출할 메서드(참조값 반환)
    private PhoneInfo readFriendInfo(){
        System.out.print("이름: ");
        String name=MenuViewer.keyboard.nextLine();
        System.out.print("전화번호: ");
        String phone=MenuViewer.keyboard.nextLine();

		/*PhoneInfo pInfo = new PhoneInfo(name, phone);
		return pInfo;*/
        return new PhoneInfo(name, phone);
    }
	 //==========================================================
    // 대학(학교)을 선택했을 때 호출할 메서드(참조값 반환)
    private PhoneInfo readUnivFriendInfo(){
        System.out.print("이름: ");
        String name=MenuViewer.keyboard.nextLine();
        System.out.print("전화번호: ");
        String phone=MenuViewer.keyboard.nextLine();
        System.out.print("전공: ");
        String major=MenuViewer.keyboard.nextLine();
        System.out.print("학년: ");
        int year=MenuViewer.keyboard.nextInt();
        MenuViewer.keyboard.nextLine();
        
        return new PhoneUnivInfo(name, phone, major, year);
    }
	 //==========================================================
    // 회사를 선택했을 때 호출할 메서드(참조값 반환).
    private PhoneInfo readCompanyFriendInfo(){
        System.out.print("이름: ");
        String name=MenuViewer.keyboard.nextLine();
        System.out.print("전화번호: ");
        String phone=MenuViewer.keyboard.nextLine();
        System.out.print("회사: ");
        String company=MenuViewer.keyboard.nextLine();
        
        return new PhoneComInfo(name, phone, company);
    }
	 //==========================================================
    public void inputData() {
        System.out.println("데이터 입력을 시작합니다..");
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택>> ");

        int choice=MenuViewer.keyboard.nextInt();
        MenuViewer.keyboard.nextLine();
        PhoneInfo info = null;
        
        switch(choice) {
		case 1:
			info = readFriendInfo();
			break;
		case 2:
			info = readUnivFriendInfo();
			break;
		case 3:
			info = readCompanyFriendInfo();
			break;
		} 
       
        infoStorage[curCnt++] = info;
        System.out.println("데이터 입력이 완료되었습니다. \n");
    }
	 //==========================================================
    public void searchData(){
        System.out.println("데이터 검색을 시작합니다..");

        System.out.print("이름: ");
        String name = MenuViewer.keyboard.nextLine();

        int dataIdx = search(name);
        if(dataIdx < 0){
            System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
        } else{
            infoStorage[dataIdx].showPhoneInfo();
            System.out.println("데이터 검색이 완료되었습니다. \n");
        } 
    }
	 //==========================================================
    public void deleteData() {
        System.out.println("데이터 삭제를 시작합니다..");

        System.out.print("이름: ");
        String name = MenuViewer.keyboard.nextLine();

		int dataIdx=search(name);
		if(dataIdx<0){
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else{
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				infoStorage[idx]=infoStorage[idx+1];

			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}   
    }
	 //==========================================================
    private int search(String name){
        for(int idx=0; idx<curCnt; idx++){
            PhoneInfo curInfo=infoStorage[idx];
            if(name.compareTo(curInfo.getName())==0)
                return idx;
        }
        return -1;
    }
}