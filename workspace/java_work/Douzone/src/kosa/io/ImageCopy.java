package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		OutputStream os = null;
		try {
			is=new FileInputStream("image.jpg");
			os = new FileOutputStream("image2.jpg");
			byte[] data = new byte[1024];
			while(true) {
				int num = is.read(data);
				if(num==-1)break;
				os.write(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				os.close();
				is.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}
