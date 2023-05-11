package kosa.oop5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] obj = {
				new Reader("둘리"),
				new Work("길동"),
				new Student("마이콜")
		};
		
		
		for(int i=0;i<obj.length;i++) {
//			if(obj[i] instanceof Reader) {
//				Reader reader = (Reader)obj[i];
//				
//				System.out.println(reader.speak()
//						);
//			}else if(obj[i] instanceof Work) {
//				Work work = (Work)obj[i];
//				System.out.println(work.speak());
			
			if(obj[i] instanceof Speakable) {
				Speakable speaker = (Speakable)obj[i];
				System.out.println(speaker.speak());
				
			}
		}
		Speakable speaker = new Speakable() {
			
			@Override
			public String speak() {
				String str="말을하자";
				return str;
			}
		};
		
		System.out.println(speaker.speak());
	}
	

}
