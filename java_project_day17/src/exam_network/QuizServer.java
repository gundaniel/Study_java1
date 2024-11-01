package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {
	public static void main(String[]args) throws IOException{
		ServerSocket serverSocket = null;
		
		try {
		serverSocket = new ServerSocket(5555);
		System.out.println("클라이어트를 기다린다.");
		}
		catch(IOException e) {
		System.out.println("다음의 포트 번호에 연결할 수 없습니다: 5555");
		System.exit(1);			
		}
		
		Socket clientSocket =null;
		try {
			clientSocket = serverSocket.accept();
			System.out.println("서버와 클라이언트가 연결되었습니다.");
		}
		catch(IOException e) {
			System.err.println("accept() 실패");
			System.exit(1);
		}
		
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		String inputLine, outputLine;
		QuizProtocol qp = new QuizProtocol();
		outputLine = qp.process(null);
		out.println(outputLine);
		
		
		while((inputLine = in.readLine()) != null) {
		outputLine = qp.process(inputLine);
		out.println(outputLine);
		if(outputLine.equals("quit"))
			break;
		}
		out.close();
		in.close();
	
		clientSocket.close();
		serverSocket.close();
	
	}
}
