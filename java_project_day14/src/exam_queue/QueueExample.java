package exam_queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[]args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));  //큐는 offer로 객체를 저장
		messageQueue.offer(new Message("sendSMS", "김철수"));
		messageQueue.offer(new Message("sendKakaotalk", "조미진"));

		while(!messageQueue.isEmpty()) { //큐에 담아둔 객체가 없을때까지
			Message message = messageQueue.poll(); //poll 메서드 - 객체를 가져옴으로 남아있는 객체 제거
		
			switch(message.getCommand()) { 
				case "sendMail" ->
					System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
				case "sendSMS" ->
					System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
				case "sendKakaotalk" ->
					System.out.println(message.getTo() + "님에게 카카오톡을 보냅니다");
			
			}
		}
	}
}
		
	
