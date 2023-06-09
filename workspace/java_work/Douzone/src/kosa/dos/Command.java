package kosa.dos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Command {
	static File nfile = new File(".");
	//static String now=file.getPath();
	
	public static void show() {
		//File file = new File(".");
		//File file = new File(now);
		File[] files = nfile.listFiles();
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
		}
		
	}
	public static void move(String dir) {
		
		//File file = new File(now);
		if(dir.equals(" ")) {
			nfile = new File(nfile.getParent(),dir);
			//now = parents.getPath();
		}else {
			File[] files = nfile.listFiles();
			for(int i=0;i<files.length;i++) {
				if(dir.equals(files[i].getName())) {
					nfile = new File(files[i].getPath());
					//file = 
					//now=child.getPath();
//					File[] childs = child.listFiles();
//					for(int j=0;j<childs.length;j++) {
//						System.out.println(childs[j].getName());
//					}
				}else {
					//System.out.println("없음");
				}
			}
		}

		
	}
	public static void make(String name) {
		File file = new File(nfile.getPath(),name);
		file.mkdir();
	}
	
	public static void DirectroyCopy(File source) {
		if(source.isDirectory()) {
			//System.out.println(source.getName());
			//System.out.println(now);
			File dest = new File(nfile.getPath(),source.getName());
			dest.mkdir();
			//File file = new File(dest.getPath(),source.getName());
//			System.out.println(dest.getPath());
//			System.out.println(dest.getParent());
			//System.out.println(file.getPath());
			File[] files = source.listFiles();
			for(int i=0;i<files.length;i++) {
				File c = new File(dest.getPath(),files[i].getName());
				if(files[i].isDirectory()) {
					files[i].mkdir();
					DirectroyCopy(c);
				}else {
					fileCopy(c);
				}
			}
		}
	}
	private static void fileCopy(File c) {
		// TODO Auto-generated method stub

		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(c);
			os = new FileOutputStream(nfile);
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
	public static void copyDirectory(File source, File dest) {
//		File dest =new File(dest.getPath(),source.getName());
//		dest.mkdir();
		//
		//source.mkdir();
		if(source.isDirectory()) {
			//File newFile = new File(dest.getPath(),source.getName());
			//newFile.mkdir();
//			dest = newFile;
			dest.mkdir();
			File[] list = source.listFiles();
			System.out.println("디렉토리 이름: "+dest.getName());
			for(int i=0;i<list.length;i++) {
				File d = new File(dest.getPath(),list[i].getName());//dest.getPath()가 아니라 dest만 써도 된다
				if(list[i].isDirectory()) {
					System.out.println("디렉토리 이름: "+list[i].getName());
					//copyFile(list[i],d);
					//File d = new File(newFile.getPath(),list[i].getName());
					list[i].mkdir();
					copyDirectory(list[i],d);
				}else {
					System.out.println("파일 이름: "+list[i].getName());
					//File c = new File(dest.getPath(),list[i].getName());
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
