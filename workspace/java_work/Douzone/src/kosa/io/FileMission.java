package kosa.io;

import java.io.File;

public class FileMission {
	

	public static void main(String[] args) {
		// 1.바이트 스트림을 이용하여 이미지 복사
		//파일이름 설정해줘야함
		String source = "C:\\Users\\KOSA\\Downloads\\itzy.jpg";
		File sFile = new File(source);
		//파일이름 설정해줘야함
		String dest = "C:\\DouZone_6\\workspace\\java_work\\Douzone\\yuna.jpg";
		File dFile = new File(dest);
		CopyUtil.copyFile(sFile,dFile);
		File dFile2= new File("C:\\Users\\KOSA\\Downloads");
		//dFile2.mkdir()
		
		CopyUtil.copyDirectory(new File("C:\\Users\\KOSA\\Desktop\\자기분석과제 및 데일리과제 안내"), dFile2);
	}

}
