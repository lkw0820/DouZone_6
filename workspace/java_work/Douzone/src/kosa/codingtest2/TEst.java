package kosa.codingtest2;

import java.util.Scanner;
import java.io.FileInputStream;
class TEst {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			N = Integer.parseInt(sc.nextLine());
			
			int[] tot=new int[N]; //그냥 합
			int[] A= new int[N];
			for(int j=0;j<N;j++) {
				A[j]=Integer.parseInt(sc.next());
				
			}
			System.out.println("#"+test_case+" "+AnswerN);
		}
	}
}
