package simplephoneinfo;

public class PhoneBookVer01 {
	public static void main(String[]args) {
		
		PhoneInfo pi = new PhoneInfo("이미경","010-2345-6573","1965.03.28");
		pi.showPhoneInfo();
	//-----------------------------------------------------------------------	
		PhoneInfo pi2 = new PhoneInfo("김현수","010-2345-6573");
		pi2.showPhoneInfo();
		
		
	}
}
