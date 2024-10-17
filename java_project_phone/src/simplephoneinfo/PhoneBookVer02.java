package simplephoneinfo;

public class PhoneBookVer02 {
	//필드선언
	private String name;
	private String number;
	private String birth;
	
	//name 접근 설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//number 접근 설정자
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	// birth 접근설정자
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	//생성자 선언
	public PhoneBookVer02() {}
	
	public PhoneBookVer02(String name, String number, String birth) {
		this.name = name;
		this.number = number;
		this.birth = birth;	
	}
	
	//출력메서드 생성
	public void showInfo() {
		System.out.format("\n입력된 정보 출력...\n");
		System.out.format("Name: " + name + "\nNumber: " + number  +  "\nBirth: " + birth + "\n");
		System.out.println();
	}
	
	
	
}
