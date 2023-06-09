package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;



public class BufferedExam {

	public static void main(String[] args) {
		// Scanner => 입력스트림
		//System.in => InputStream 객체 생성 => InputStreamReader로 문자스트림으로 변경 => BufferedReader
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in); //보조 스트림 inputStream과 BufferedReader스트림을 연결
//		BufferedReader br = new BufferedReader(isr);
		BufferedReader br =null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			System.out.println("입력: ");
			String str="";
			while((str = br.readLine())!=null) {
				str+="\n";
				bw.write(str);
			}
			System.out.println("쓰기 완료");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
