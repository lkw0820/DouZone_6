package kosa.codingtest2;

import java.util.Scanner;
import java.io.FileInputStream;
class Main {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int answer=0;
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			int[] tot=new int[N]; //그냥 합
			int[] A= new int[N];
			
			for(int j=0;j<N;j++) {
				A[j]=Integer.parseInt(sc.next());
			}
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					tot[i]+=A[j];
				}
			}
			int[] subMax= new int[N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(i!=j) {
						subMax[i]+=A[j];
					}
				}
			}
			int[] subTot=new int[N];
			for(int j=0;j<N;j++) {
				for(int i=0;i<N-1;i++) {
					
					if(Math.abs(subMax[i])>Math.abs(subMax[i+1])) {
						subTot[j]= Math.abs(subMax[i]);
					}else {
						subTot[j]= Math.abs(subMax[i+1]);
					}
				}
//				if(subTot[j]>tot[j]) {
//					AnswerN+=subTot[j];
//				}else {
//					AnswerN+=tot[j];
//				}
				if(subTot[j]>tot[j]) {
					answer+=subTot[j];
				}else {
					answer+=tot[j];
				}
				
			}
			System.out.println("#"+test_case+" "+answer);
			answer=0;
			//System.out.println("#"+test_case+" "+AnswerN);
		}
	}
}