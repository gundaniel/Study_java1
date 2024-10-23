package simplephoneinfo;

public class PhoneBookVer03 {
	public static void main(String[] args) {
       
		PhoneBookManager manager = new PhoneBookManager();
        int choice;

        while(true) {
            MenuViewer.showMenu();
            choice = MenuViewer.keyboard.nextInt();
            MenuViewer.keyboard.nextLine();

            switch(choice) {
                case 1:
                    manager.inputData();
                    break;
                case 2:
                    manager.searchData();
                    break;
                case 3:
                    manager.deleteData();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}