package kosa.mission;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mission05_03_4 {

   static int count = 0;

   public static void add(int cnt, int arr[][]) {
      Scanner sc = new Scanner(System.in);
      String sub[] = { "국어", "영어", "수학" };
      // 이거 좋다
      int f = 0;
      if (cnt == 0) {
         f = count;

         arr[f][4] = 0;
         for (int i = 1; i <= sub.length; i++) {
            arr[f][i] = sc.nextInt();
            // 총점
            arr[f][4] += arr[f][i];
         }
         arr[f][5] = arr[f][4] / sub.length;
      } else {
         f = cnt - 1;
         for (int j = 0; j < arr.length; j++) {
            if (arr[j][0] == cnt) {
               arr[j][4] = 0;
               for (int i = 1; i <= sub.length; i++) {
                  arr[j][i] = sc.nextInt();
                  // 총점
                  arr[j][4] += arr[j][i];
               }
            }
//            f = (cnt==0)?count: cnt-1;
            arr[j][5] = arr[j][4] / sub.length;
         }
         
      }
      // 평균

      if (arr[f][0] == 0) {
         arr[f][0] = f + 1;
         f++;
         count = f;
      }

      // System.out.println(count);
   }

   public static void print(int arr[][]) {
      for (int i = 0; i < count; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][0] == 0) {
               return;
            }
            System.out.print(arr[i][j] + "\t");
         }
         System.out.println();
      }
   }

   public static void search(int arr[][]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = 0; i < arr.length; i++) {
         int a = arr[i][0];

         if (a == n) {
            for (int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j] + "\t");
            }
         }
      }
      System.out.println();
   }

   public static void sort(int arr[][]) {
//      for(int i=0;i<arr.length;i++) {
//         if(arr[i][0] ==0) {
//            arr[][] = arr length - (i-1)
//         }
//      }
      // sint[][] arr2=Arrays.copyOfRange(arr, 0, count);
//      for (int i = 0; i < count; i++) {
//         for (int j = 0; j < arr2[i].length; j++) {
//            System.out.print(arr2[i][j]+"\t");
//         }
//         System.out.println();
//      }
      Arrays.sort(arr, new Comparator<int[]>() {

         @Override
         public int compare(int[] o1, int[] o2) {
            if (o1[4] < o2[4] && (o1[4] != 0 && o2[4] != 0)) {
               return -1;
            } else if (o1[4] > o2[4]) {
               return 1;
            } else {
               return 0;
            }
         }
      });
//      System.out.println(Arrays.deepToString(arr2));1
//      
//      arr = arr2.clone();
//      
//      for(int i=0;i<3;i++) {
//         for(int j=0;j<6;j++) {
//            System.out.print(arr[i][j]+", ");
//         }
//      }

//      for(int i=0;i<3;i++) {
//         for(int j=0;j<6;j++) {
//            //arr[i][j]=0;
//            arr[i][j]=arr2[i][j];
//            //System.out.println(arr[i][j]+"");
//            System.out.print(arr[i][j]);
//         }
//      }
//      for (int i = 0; i < count; i++) {
//         for (int j = 0; j < arr2[i].length; j++) {
//            System.out.print(arr2[i][j]+"\t");
//         }
//         System.out.println();
//      }
   }

   private static void delete(int[][] arr) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = n - 1; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (i + 1 > arr[i].length) {
               arr[i][j] = 0;
            } else {
               arr[i][j] = arr[i + 1][j];
            }

         }
      }

   }

   private static void update(int a, int[][] arr) {
      add(a, arr);
   }

   public static void main(String[] args) {
      /*
       * 성적관리 3.0
       * 
       * 1. 성적 추가 2. 성적 전체출력 3. 성적 조회 4. 성적 정렬 5. 성적 수정 6. 성적 삭제 7. 종료
       * 
       * 1명의 성적(번호, 국어, 영어, 수학, 총점, 평균) => int 2차원 배열 int[10][6]; =>생성
       * 
       * 성적조회 : 번호를 기준으로 검색 성적정렬 : 총점을 기준으로 오름차순 정렬 성적수정 : 국어, 영어, 수학 점수 변경 가능 => 총점,
       * 평균도 수정 성적삭제 : 삭제 대상을 기준으로 뒷쪽 데이터가 앞으로 이동
       */

      Scanner sc = new Scanner(System.in);
      System.out.println("성적관리 3.0");
      System.out.println("메뉴");
      System.out.println("1. 성적 추가");
      System.out.println("2. 성적 전체 출력");
      System.out.println("3. 성적 조회");
      System.out.println("4. 성적 정렬");
      System.out.println("5. 성적 수정");
      System.out.println("6. 성적 삭제");
      System.out.println("7. 프로그램 종료");

      int n = 0;
      int[][] arr = new int[10][6];

      while (true) {
         System.out.print("입력: ");
         n = sc.nextInt();

         switch (n) {
         case 1:
            System.out.println("성적추가");
            add(0, arr);
            break;
         case 2:
            System.out.println("성적전체출력");
            print(arr);
            break;
         case 3:
            System.out.println("성적조회");
            search(arr);
            break;
         case 4:
            System.out.println("성적정렬");
            sort(arr);
            break;
         case 5:
            System.out.println("성적수정");
            System.out.print("수정할 번호 입력: ");
            int a = sc.nextInt();
            update(a, arr);
            break;
         case 6:
            System.out.println("성적삭제");
            delete(arr);
            break;
         case 7:
            System.out.println("종료");
            return;

         }

      }

   }
}