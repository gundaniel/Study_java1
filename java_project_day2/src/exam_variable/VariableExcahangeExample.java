package exam_variable;

public class VariableExcahangeExample {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;	
		int temp;
		
			System.out.println("교환전 값은");
			System.out.println("num1= " + num1 + " num2= " + num2 + " 입니다.");
			 
										//값을 교환할때 변수의 선언이 필요, 값을 서로 맞바꾸는 것은 불가능		
		temp = num1; // = 1 	
		num1 = num2; // = 2
		num2 = temp; // = 1
		int Plus;
		Plus =  num1 + num2 + temp;
		
			System.out.println("교환후 값은");
			System.out.printf("num1= %d 이며, num2= %d 입니다.\n",num1, num2);

			System.out.printf("모두를 더한값은%d입니다",Plus);
			
			

		
		
		
	}
}
