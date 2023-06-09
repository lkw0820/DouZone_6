package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderExam {

	public static void main(String[] args) {
		// 파일에 있는 문자데이터 읽어오기 poem.txt
		FileReader reader = null;
		char[] arr = new char[10];
		try {
			//스트림 생성
			reader = new FileReader("poem.txt");
			while(true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);//배열의 크기만큼 문자 출력
				if(data==-1) {
					break;
				}
				System.out.print(arr);
			}
//			while(true) {
//				int data = reader.read();//한개 문자 읽기
//				if(data==-1) {
//					break;
//				}
//				System.out.print((char)data);
//			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			} 
		}
	}

}
