package exam_class_array;

class Phone{
	
	// 필드 생성
	private String name;
	private String company;

	// null 생성자
	public Phone() {}
	// 생성자
	public Phone(String name, String company) {
		this.name = name;
		this.company = company;
	}
	
	//출력 메서드
	public void printData() {
		System.out.printf("핸드폰명:%s\t제조사명:%s\n", name, company);
	}
}

//------------------------------------------------------------------------
		
public class PhoneObjectArray {
	public static void main(String[]args) {
	
	//----------------------------------------------
		// 참조변수 표현 출력구문(1)
		Phone p1, p2, p3; 					 // 객체 선언
		p1 = new Phone("아이폰16","애플"); 	 // 객체 생성 		
		p2 = new Phone("갤럭시S24","삼성");
		p3 = new Phone("갤럭시폴드4","삼성");
		// 출력
		p1.printData();
		p2.printData();
		p3.printData();
		System.out.println();
	//----------------------------------------------
		// 객체의 배열과 표현 - 출력구문 (2)
		Phone[] p = new Phone[3];
	
		p[0] = new Phone("아이폰16","애플");
		p[1] = new Phone("갤럭시S24","삼성");
		p[2] = new Phone("갤럭시폴드4","삼성");
		// 출력
		for(int i = 0; i <p.length; i++) {
			p[i].printData();	
		}
		System.out.println();
	//----------------------------------------------
		// for ~ each 출력구문(3) 
 		for(Phone ph : p) { // 향상된 for문 (자료형 변수명 : 배열명){}
 			ph.printData();
 		}
 		System.out.println();
 	//----------------------------------------------
 		// new Phone 생략하여 출력구문(4)
 		Phone[] ph1 = { 
 				new Phone("아이폰16","애플"),
 				new Phone("갤럭시S24","삼성"),
 				new Phone("갤럭시폴드4","삼성")
 		}; // 세미콜론이 중괄호 뒤에 옴 
 		for(Phone phone : ph1) { //향상된 for문 (자료형 변수명 : 배열명){}
 			phone.printData();
 		}
 		
	}
	
}