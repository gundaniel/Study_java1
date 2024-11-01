package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient {
    public static void main(String[] args) throws IOException {
        Socket quizSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            quizSocket = new Socket("localhost", 5555);

            out = new PrintWriter(quizSocket.getOutputStream(), true); // 출력 스트림(클라이언트에서  서버로 데이터 전송)
            in = new BufferedReader(new InputStreamReader(quizSocket.getInputStream())); // 입력 스트림(서버로부터 데이터를 클라이언트로 읽어 들임)
        } 
        catch (UnknownHostException e) {
            System.err.println("localhost에 접근할 수 없습니다.");
            System.exit(1);
        } 
        catch (IOException e) {
            System.err.println("입출력 오류");
            System.exit(1);
        }

        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));// 사용자로 하여금 데이터 입력
        String fromServer;
        String fromUser;

        while ((fromServer = in.readLine()) != null) {
            System.out.println("서버: " + fromServer);
            if (fromServer.equals("quit"))
                break;

            fromUser = user.readLine();
            if (fromUser != null) {
                System.out.println("클라이언트: " + fromUser);
                out.println(fromUser);
            }
        }
        out.close();
        in.close();
        quizSocket.close();
    }

}