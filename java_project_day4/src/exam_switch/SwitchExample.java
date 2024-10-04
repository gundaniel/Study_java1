package exam_switch;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        int score = 0;
        Scanner input = new Scanner(System.in);
        	

        		System.out.print("점수는 0~100 사이로 입력해 주세요.");
        	score = input.nextInt();
        
        	while(score <0 || score > 100) {
        		System.out.printf("잘못입력하셨습니다 다시 입력해주세요."); 	
        	score = input.nextInt();
        	}
     
        	
        	//do while로 변경할것 ★
        
        	String grade;
        
        	switch (score/10) {  
        		case 10: case 9:  		//정수의 값만 입력 (실수 사용 불가)
        			grade = "A";
        			break;
        		case 8:
        			grade = "B";
        			break;
        		case 7:
        			grade = "C";
        			break;
        		case 6:
        			grade = "D";
        			break;
        		default:
        			grade = "F";
        			break;
        	}
        
       // if(score > 100 || score < 0) {
        	//System.out.printf("잘못입력하셨습니다 다시 입력해주세요"); 	
        //}
        	if(score >= 100 || score >= 0) {
        		System.out.printf("당신의 점수%d점은 " + "\"" + grade + "\"" + "입니다",score);
        	} 
        	
     
        
           	
        	input.close();
        }       	
    }
    

      /*  char grade;
        System.out.printf("점수 = %d " , score);
        
        if(score>=90)
        	grade = 'A';
        else if(score>=80)
        	grade = 'B';
        else if(score>=70)
        	grade = 'C';
        else if(score>=60)
        	grade = 'D';
        else
        	grade = 'F';
        // 위 if ~ else if를 switch문으로 변경해 주세요.
        
        
        
        System.out.printf("학점 = %c" , grade);
        
        */

        
    