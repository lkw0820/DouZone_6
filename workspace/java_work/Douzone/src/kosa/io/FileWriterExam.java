package kosa.io;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		// 키보드로부터 문자열을 입력 받아 파일에 쓰기
		//"q"를 입력하기 전까지 문자열 파일에 쓰다
		//FileWriter write(문자열)
		//파일명: poem2.txt : 물리적 파일 미리 생성할 필요없다
		//파일 생성 유무 : refresh
		//close()
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String str ="";
		String poem = "";
		while(!(str=sc.nextLine()).equals("q")) {
			poem += str;
			poem +="\n";
		}
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(poem);
//			while(true) {//!str.equals("q")
//				String str = sc.nextLine();
//				if(str.equals("q")) {
//					break;
//				}
//				str+="\n";
//				writer.write(str);
//			}

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
