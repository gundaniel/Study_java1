package exam_multi_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			int[] i = new int[2];
			System.out.println("정수를 입력해 주세요.");
			i[2] = scan.nextInt();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 번호를 벗어납니다. ");
		} catch (InputMismatchException e) {
			System.out.println("정수가 아닙니다. ");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}