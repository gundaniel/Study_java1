package exam_steck;

import java.util.Stack;

public class StackExample {
	public static void main(String[]args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// push() 메서드 : Stack 에 데이터 추가
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//pop() 메서드 : Stack 에 데이터 반환.
		while(!coinBox.isEmpty()) { //부정연산자 확인
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전(pop)" + coin.getValue() + "원");
		}
		System.out.println((coinBox.isEmpty() == true) ? "동전이 모두 꺼내졌습니다" : "코인이 아직 존재합니다");
	}
}
