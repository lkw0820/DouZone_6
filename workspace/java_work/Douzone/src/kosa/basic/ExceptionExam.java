package kosa.basic;

public class ExceptionExam {
	public static void noEquals(int a, int b) {
		if( a==b) {
			try {
			throw new Exception("같은값");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("1");
			noEquals(10, 10); //여기서 예외 발생 -> catch로 이동
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally{
			System.out.println("4");
		}
		System.out.println("5");
		// TODO Auto-generated method stub
//		int a=10;
//		int b=0;
//		try {
//			int r=a/b;
//		}catch(Exception e){
//			//에러 정보 출력 방법
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("done");

	}

}
