package kosa.mission;

public class Mission2_2 {

	public static void main(String[] args) {
		// 성적관리프로그램 여러명의 성적을 구현해보자
		// 번호 	국어	영어	수학	총점	평균
		//  1	90	80	70	240	80
		//  2	50	40	60	150	50
		//==============================
		//		140	120	110
		//		70	60	55
		int[][] score= { 	//국		영
				{90,80,70}, //0,0	0,1
				{50,40,60}, //1,0	1,1
				{60,70,80},
		};
		
		//0 총점 1평균
		int[][] st=new int[3][2];
		//0국 
		int[][] sub=new int[3][2];
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				st[i][0]+=score[i][j];
				sub[i][0]+=score[j][i]; //0,0 1,0 2,0 	1,0 1,1 1,2		2,0 2,1 2,2
			}
			st[i][1]=st[i][0]/3;
			sub[i][1]=sub[i][0]/3;
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"\t" +score[i][0]+"\t"+score[i][1]+"\t"+score[i][2]+"\t"+st[i][0]+"\t"+st[i][1]);
		}
		System.out.println("===========================================================================");
		for(int i=0;i<2;i++) {
			System.out.println("과목별 \t"+sub[0][i]+"\t"+sub[1][i]+"\t"+sub[2][i]);
		}
		System.out.println();
		
		
		
		
		
		//1 국 score[0][0] 2국어 score[1][0] 3국어 score[2][0]
		int[][] score2= { 	//국		영
				{90,80,70,0,0}, //0,0	0,1
				{50,40,60,0,0}, //1,0	1,1
				{60,70,80,0,0},
		};
		int[][] sub2=new int[3][2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				score2[i][3]+=score2[i][j];
				//과목별 총점
				sub2[i][0]+=score2[j][i];
			}
			score2[i][4]=score2[i][3]/3;
			//과목별 평균
			sub2[i][1]=sub2[i][0]/3;
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<score2.length;i++) {
			System.out.print((i+1)+"\t");
			for (int j=0;j<score2[i].length;j++) {
				
				System.out.print(score2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("===================================================================");
		
		for(int i=0;i<2;i++) {
			System.out.print("\t");
			for(int j=0;j<3;j++) {
				System.out.print(sub2[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
