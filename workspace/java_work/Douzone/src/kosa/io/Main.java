package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	Member m;
	//객체 직렬화
	public void write() {
		//m=new Member("홍길동");
		m=new Member("이길동",new Video(1,"name","actor"));
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
			oos.writeObject(m);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	//객체 역직렬화
	public void read() {
		ObjectInputStream ois =null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.txt"));
			m = (Member)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main sm = new Main();
		sm.write();//직렬화
		sm.m=null;//이러면 파일에있는 멤버 객체밖에 없음
		sm.read();//역직렬화
		System.out.println(sm.m);
		
		
	}

}
