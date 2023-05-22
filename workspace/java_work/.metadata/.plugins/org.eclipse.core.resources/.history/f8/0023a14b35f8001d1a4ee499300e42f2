package kosa.net2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

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
				if(str.equals("bye")) break;
				writer.println(str);
				writer.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
