package exam_none_generic_type;

public class BoxExample {
	public static void main(String[]args) {
		Box box = new Box();
	
		//"Box"에 문자열형 값 "홍길동" 대입
		box.set("홍길동");
		//box.set(new String("홍길동"));
		String name = (String) box.get();
		System.out.println("name = " + name);	
	//---------------------------------------------------	
		//"Box"에 정수형 값 5 대입 (1)
		box.set(Integer.valueOf(5));	
		Integer i = (Integer) box.get();
		System.out.println("i= " + i.intValue());
		//"Box"에 정수형 값 5 대입 (2)
		box.set(5); //오토박싱 ( 기초형 -> 참조형)
		int iValue = (Integer) box.get();
		System.out.println("iValue = " + iValue);
	//---------------------------------------------------	
		//"Box"에 실수형 값 8.4 대입 (1)
		Double dNum = Double.valueOf(8.4);
		box.set(dNum);
		Double d = (Double) box.get();
		System.out.println("d = " + d); //(d.doubleValue())		
		//"Box"에 실수형 값 8.4 대입 (2)
		box.set(8.4); //오토박싱
		double dValue = (Double) box.get();
		System.out.println("dValue = " + dValue);
	//---------------------------------------------------	
		//"Box"에 문자형 '잠'을 대입(1)
		Character ch = Character.valueOf('잠');
		box.set(ch);
		Character c = (Character) box.get();
		System.out.println(c.charValue());
		//"Box"에 문자형 '잠'을 대입(2)
		box.set('잠');
		char cValue = (Character) box.get();
		System.out.println(cValue);
	//---------------------------------------------------	
		
		//"Apple"클래스에 있는 toString을 출력
		box.set(new Apple("황금색"));
		Apple apple = (Apple) box.get();
		System.out.println(apple.toString());

		// 코드 자체는 오류가 없으나, 컴파일시 오류 남 (변환타입이 Integer)
		String str = "java";
		box.set(str);
		System.out.println("값: " + (String) box.get());  //(Integer => String)으로 변환
				
	}
}
