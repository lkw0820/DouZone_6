package kosa.net3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;//접속한 클라이언트 소켓
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("서버 실행중");
			while(true) {
				socket = serverSocket.accept();//요청 대기중
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				//socket.close();
				//serverSocket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
