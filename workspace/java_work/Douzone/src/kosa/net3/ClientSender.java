package kosa.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;

public class ClientSender extends Thread {
	Socket socket;

	public ClientSender(Socket socket) {
		super();
		this.socket = socket;
	}

	public ClientSender() {
		super();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			while(true) {
				String str = br.readLine();
				if(str.equals("bye")) {
					//끝을 보내기 위해서
					String str2 = URLEncoder.encode("끝","utf-8");
					writer.println(str2);
					writer.flush();
					break;
				}
				//문자를 보내기 위해서, 채팅하기 위해서
				String str2 = URLEncoder.encode(str,"utf-8");
				writer.println(str2);
				writer.flush();

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
