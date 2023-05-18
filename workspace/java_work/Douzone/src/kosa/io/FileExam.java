package kosa.io;

import java.io.File;

public class FileExam {
	public static void show(File file) {
		File[] list = file.listFiles();
		for(int i=0;i<list.length;i++) {
			if(list[i].isDirectory()) {
				System.out.println("폴더 "+list[i].getName());
				show(list[i]);//재귀함수
			}else {
				System.out.println("파일 "+list[i].getName());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\KOSA\\Downloads\\eclipse\\eclipse";
		
		File f = new File(path);
		show(f);
		

	}

}
