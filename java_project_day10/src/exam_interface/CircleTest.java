package exam_interface;

class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "원의 반지름: " + radius;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle(5.7);
		Circle circle2 = new Circle(8.9);
		
		if(circle1.getRadius() > circle2.getRadius()) {
			System.out.println("첫번째 원이 두번째 원보다 크다");
		}else if(circle1.getRadius() == circle2.getRadius()) {
			System.out.println("두 원의 크기가 같다");
		}else {
			System.out.println("첫번째 원이 두번째 원보다 작다.");
		}
	}
}



