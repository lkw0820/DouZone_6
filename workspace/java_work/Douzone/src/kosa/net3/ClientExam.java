package kosa.net3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.197",9000);
//			InputStream in = socket.getInputStream();
//			OutputStream out = socket.getOutputStream();
//			
//			String message ="Hellow";
//			out.write(message.getBytes());
//			byte[] arr = new byte[100];
//			in.read(arr);
//			System.out.println("서버가 보낸 메세지: "+new String(arr));
			Thread recieve = new ClientReceive(socket);
			Thread sender = new ClientSender(socket);
			recieve.start();
			sender.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				//socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
