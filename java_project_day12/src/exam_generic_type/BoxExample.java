package exam_generic_type;
import exam_none_generic_type.Apple;
public class BoxExample {
	public static void main(String[]args) {
		
		 //인스턴스 생성 -> 뒤에 타입인자(String)는 생략가능!
		Box<String> box1 = new Box<String>("Hello"); //값을 바로 줌을 통하여 설정하지 않아도 됨
		String str = box1.get();
		System.out.println(str);
		
		//정수 자료형으로 설정 후 6을 대입
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
		
		//설정된 Apple 타입으로 컬러를 대입
		Box<Apple> box3 = new Box<>(new Apple("청색"));
		Apple app = box3.get();
		System.out.println(app.toString());
		
		//실수 자료형으로 설정 후 3.6을 대입
		Box<Double> box4 = new Box<>();
		box4.set(3.6);
		double data = box4.get();
		System.out.println(data);
	}

}
