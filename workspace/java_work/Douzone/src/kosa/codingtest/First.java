package kosa.codingtest;
import java.util.Scanner;
import java.io.FileInputStream;

public class First {

	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int x_col=0;
		int x_row=0;

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			sc.nextLine();
			int[][] arr = new int[N][N];
			//L=-1, X=0, H=1, Y=2
			//장기 판 만들기
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					String a = sc.next();
					switch (a) {
					case "L":
						arr[i][j]=-1;
						break;
					case "X":
						arr[i][j]=0;
						//1. x의 위치 찾기
						x_col=i;
						x_row=j;
						break;
					case "H":
						arr[i][j]=1;
						break;
					case "Y":
						arr[i][j]=2;
						break;
					}
				}
			}
			
			//계산

			
			//2. x와 같은 열과 행 찾기
			
			//3. 계산
			//열의 배열로 따로 빼고 
			//110-1-1-111
			//int[] row = new int[N];//x와 같은 열에 있는 것
			int[] row1 = new int[x_row+1]; //앞 3
			int[] row2 = new int[N-row1.length+1]; //뒤 5
			for(int i=0;i<row1.length;i++) {
				row1[i]=arr[x_col][i];
			}
			for(int i=0;i<row2.length;i++) {
				row2[i]=arr[x_col][i+x_row];
			}
			//앞에거 계산
			for(int i=row1.length-1;i>0;i--) {
				if(row1[i-1]==2) {
					break;
				}else if(row1[i-1]==-1) {
					continue;
				}else if(row1[i-1]==1) {
					if(i-2>=0) {
						if(row1[i-2]==1) {
							AnswerN++;
							i--;
							continue;
						}
					}
				}
			}
			//뒤에거 계산
			for(int i=0;i<row2.length-1;i++) {
				if(row2[i+1]==2) {
					break;
				}else if(row2[i+1]==-1) {
					continue;
				}else if(row2[i+1]==1) {
					if(i+2<=row2.length-1) {
						if(row2[i+2]==1) {
							AnswerN++;
							i++;
							continue;
						}
					}
				}
			}
			//int[] col = new int[N]; //x와 같은 행에 있는 것
			int[] col1 = new int[x_col+1]; //앞 
			int[] col2 = new int[N-col1.length+1]; //뒤 
			for(int i=0;i<col1.length;i++) {
				col1[i]=arr[i][x_row];
			}
			for(int i=0;i<col2.length;i++) {
				col2[i]=arr[i+x_col][x_row];
			}
			
			//앞에거 계산
			for(int i=col1.length-1;i>0;i--) {
				if(col1[i-1]==2) {
					break;
				}else if(col1[i-1]==-1) {
					continue;
				}else if(col1[i-1]==1) {
					if(i-2>=0) {
						if(col1[i-2]==1) {
							AnswerN++;
							i--;
							continue;
						}
					}
				}
			}
			//뒤에거 계산
			for(int i=0;i<col2.length-1;i++) {
				if(col2[i+1]==2) {
					break;
				}else if(col2[i+1]==-1) {
					continue;
				}else if(col2[i+1]==1) {
					if(i+2<=col2.length-1) {
						if(col2[i+2]==1) {
							AnswerN++;
							i++;
							continue;
						}
					}
				}
			}
			System.out.println("#"+test_case+" "+AnswerN);
			AnswerN=0;
		}
	}
}
