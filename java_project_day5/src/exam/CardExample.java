package exam;
import java.util.Scanner;
public class CardExample {
	public static void main(String[]args) {
	/* 카드를 랜덤하게 선택하여 화면에 출력하는 코드를 작성해보자. (클래스명: CardExample)
	 * { "Clubs", "Diamonds", "Hearts", "Spades" }와 
	 * { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}를 
	 * 가지고 있는 문자열 배열(1차원 배열)을 생성하고 위 내용으로부터 랜덤하게 하나의 카드를 선택하는 코드를 작성하라. 
	 * 실행 결과 : Hearts의 Jack
	*/

	String[] card = {"Clubs","Diamonds","Hearts","spades"};
	String[] number = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	
	int a = (int)(Math.random()* 4);	// 0 ~ 3
	int b = (int)(Math.random()* 13); // 0 ~ 12
	
	System.out.print(card[a] + " 의 " + number[b]);
	
	
	
	}
}
