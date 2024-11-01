package exam_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[]args) throws UnknownHostException {
		InetAddress itan = InetAddress.getByName("www.naver.com"); //생성자가 없음                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		InetAddress itad = InetAddress.getByName("www.daum.net");
		
		System.out.println("호스트 명과 IP : " + itan.toString());
		System.out.println("호스트 명 : " + itad.getHostName()); // 호스트의 이름을 나타내는 문자열 출력
		System.out.println("IP: " + itad.getHostAddress()); // 호스트의 주소(IPv4)를 출력
		System.out.println("============================================");
		
		InetAddress ina[] = InetAddress.getAllByName("www.naver.com");  // 전달받은 이름으로 지정된 모든 컴퓨터를의 갤체를 배열로 반환
		for(int i = 0 ; i < ina.length; i++) {
			System.out.println(ina[i]);
		}
		System.out.println("============================================");
		
		InetAddress ital = InetAddress.getLocalHost(); //현재 컴퓨터의 객체를 반환
		System.out.println("로컬 컴퓨터 이름: " + ital.getHostName());
		System.out.println("로컬 컴퓨터 IP주소 :" + ital.getHostAddress());
		
		


}
}
