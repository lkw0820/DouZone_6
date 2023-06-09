package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class CopyUtil {
	//디렉토리 복사 (새로운 디렉토리르 생성후 모든 파일 복사)
	public static void copyDirectory(File source, File dest) {
		if(source.isDirectory()) {
			dest.mkdir();
			File[] list = source.listFiles();
			for(int i=0;i<list.length;i++) {
				File d = new File(dest.getPath(),list[i].getName());//dest.getPath()가 아니라 dest만 써도 된다
				if(list[i].isDirectory()) {
					System.out.println("디렉토리 이름: "+list[i].getName());
					//copyFile(list[i],d);
					list[i].mkdir();
					copyDirectory(list[i],d);
				}else {
					System.out.println("파일 이름: "+list[i].getName());
					copyFile(list[i],d);
				}
			}
			System.out.println("디렉토리 복사 완료");
		}
	}
	
	
	//1.바이트 값을 가진 파일 한개를 복사하는 메소드
	public static void copyFile(File source, File dest) {
		String s=source.getPath();
		String d=dest.getPath();
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] data = new byte[1024];
			while(true) {//(is.read(data))!=-1
				int num=is.read(data);
				if(num==-1)break;
				os.write(data,0,num);
				//Arrays.fill(data, (byte)0);
			}
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(os!=null)os.close();
				if(is!=null)is.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
