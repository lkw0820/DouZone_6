package kosa.io;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Program Files/Java/jdk-11.0.12/lib/");
		File arr[] = file.listFiles();
		for(int cnt =0 ; cnt<arr.length;cnt++) {
			String name = arr[cnt].getName();
			if(arr[cnt].isFile())
				System.out.println(name+" 길이: "+arr[cnt].length());
			else
				System.out.println(name);
		}
	}

}
