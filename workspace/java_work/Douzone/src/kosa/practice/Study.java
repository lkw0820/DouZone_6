package kosa.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<String>(); 
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//int n = Integer.parseInt(sc.nextLine());
		try {
			int n = Integer.parseInt(bf.readLine());
			for(int i=0;i<n;i++) {
				//String[] str=sc.nextLine().split(" ");
				String[] str=bf.readLine().split(" ");
				//System.out.println(str[0]);
				switch (str[0]) {
				case "push":
					queue.add(str[1]);
					//System.out.println(str[1]);
					break;
				case "pop":
					if(queue.size()==0) {
						bw.write("-1");
						bw.newLine();
						//System.out.println("-1");
					}else {
						bw.write(queue.get(0));
						bw.newLine();
						//System.out.println(queue.get(0));
						queue.remove(0);
					} 
					break;
				case "size":
					bw.write(queue.size());
					bw.newLine();
					//System.out.println(queue.size());
					break;
				case "empty":
					if(queue.size()==0) {
						bw.write("1");
						bw.newLine();
						//System.out.println("1");
					}else {
						bw.write("0");
						bw.newLine();
						//System.out.println("0");
					}
					break;
				case "front":
					if(queue.size()==0) {
						bw.write("-1");
						bw.newLine();
						//System.out.println("-1");
					}else {
						bw.write(queue.get(0));
						bw.newLine();
						//System.out.println(queue.get(0));
					}
					break;
				case "back":
					if(queue.size()==0) {
						bw.write("-1");
						bw.newLine();
						//System.out.println("-1");
					}else {
						bw.write(queue.get(queue.size()-1));
						bw.newLine();
						//System.out.println(queue.get(queue.size()-1));
					}
					break;
				default:
					break;
				}
				bw.flush();
				 
			}
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
