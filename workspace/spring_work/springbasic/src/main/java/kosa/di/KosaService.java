package kosa.di;

@org.springframework.stereotype.Service
public class KosaService implements Kosa {

   public void insertService() {
      System.out.println("kosa insertService() 호출");
   }

   public void listService() {      
      System.out.println("kosa listService() 호출");
   }

}