package kosa.dos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try {
				String str = br.readLine();
				//String[] command = {"",""};
				String[] command = str.split(" |\\.");
//				System.out.println(command[1]);
				String cm=command[0];
				String a=" ";
				if(command.length==2) {
					a = command[1];
				}
				
				//String dir=command[1];
				switch (cm) {
				case "ls":
					//파일목록출력
					Command.show();
					break;
				case "cd":
					Command.move(a);
					break;
				case "mkdir":
					Command.make(a);
					break;
				case "cp":
					File file = new File(a);
					
					Command.copyDirectory(file, Command.nfile);
					//Command.DirectroyCopy(file);
					break;

				default:
					break;
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
	}

}
