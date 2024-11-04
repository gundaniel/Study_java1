package exam_network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/* UDP 통신을 이용하여서 간단한 채팅을 할 수 있는 메시저를 작성하여 보자.
 * 여기서 송신용 포트 번호와 수신용 포트 번호가 고정되어 있다.*/
public class MessengerB {
    protected JTextField textField;
    protected JTextArea textArea;
    protected JScrollPane scrollPane;

    DatagramSocket socket;
    DatagramPacket packet;
    InetAddress address = null;

    final int myPort = 6000; // 수신용 포트 번호
    final int otherPort = 5000; // 송신용 포트 번호

    public MessengerB() throws IOException {
        new MyFrame();
        address = InetAddress.getByName("127.0.0.1");
        socket = new DatagramSocket(myPort);
    }

    // 패킷을 받아서 텍스트 영역에 표시한다.
    public void process() {
        while (true) {
            try {
                byte[] buf = new byte[256];
                packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet); // 패킷을 받는다.
                // 받은 패킷을 텍스트 영역에 표시한다.
                textArea.append("RECIEVED: " + new String(buf) + "\n");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    class MyFrame extends JFrame implements ActionListener { //화면을 만들기 위한 내부 클래스 정의
        private static final long serialVersionUID = 1L;

        public MyFrame() {
            super("000님의 메신저");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            textField = new JTextField(30);
            textField.addActionListener(this);

            textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            scrollPane = new JScrollPane(textArea);  //스크롤패인 추가
            scrollPane.setVerticalScrollBarPolicy(
                    ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setHorizontalScrollBarPolicy(
                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            add(textField, BorderLayout.PAGE_END);
            //add(new JScrollPane(textArea), BorderLayout.CENTER);
            add(scrollPane, BorderLayout.CENTER);
            pack();
            setVisible(true);
        }

        public void actionPerformed(ActionEvent evt) {
            String s = textField.getText();
            byte[] buffer = s.getBytes();
            DatagramPacket packet;

            // 패킷을 생성한다.
            packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
            try {
                socket.send(packet); // 패킷을 보낸다.
            } catch (IOException e) {
                e.printStackTrace();
            }
            textArea.append("SEND: " + s + "\n");
            textField.selectAll();
        }
    }
    
    public static void main(String[] args) throws IOException {
        MessengerB m = new MessengerB();
        m.process();
    }
}