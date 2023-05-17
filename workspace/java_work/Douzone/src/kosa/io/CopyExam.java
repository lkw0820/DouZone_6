package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class CopyExam {

	public static void main(String[] args) {
		// poem2.txt => poem3.txt 복사
		FileReader reader=null;
		FileWriter writer=null;
		char[] arr = new char[100];
		try {
			reader = new FileReader("poem2.txt");
			writer = new FileWriter("poem3.txt");
			while(true) {
				Arrays.fill(arr,' ');
				int data = reader.read(arr);
				if(data==-1)break;
				writer.write(arr);
			}
//			int data=0;
//			String str="";
//			while(!(data==-1)) {
//				
//				data = reader.read();
//				char c = (char)data;
//				System.out.print(c);
//				str= str+c+"";
//			}
//			writer.write(str);
		}catch(Exception e) {
			
		}finally {
			try {
				writer.close();
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		

	}

}
