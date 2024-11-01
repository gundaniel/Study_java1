package exam_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[]args) {
		
		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;
		System.out.println("서버입니다 클라이언트를 기다립니다.");
		try {
			listener = new ServerSocket(9999);
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inputMessage;
			while(true) {
				inputMessage = in.readLine();
				if(inputMessage.equals("끝")) {
					 System.out.println("접속을 종료합니다");
					 break;
				}
				System.out.println(",,," + inputMessage);
			}
			socket.close();
			listener.close();
		}catch (Exception e) {
			System.out.println("입출력 오류가 발생했습니다");
		}
	}
}
