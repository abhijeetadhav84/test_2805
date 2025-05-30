package Inheritenance;

public class Son extends father {
	
      public static void main(String[] args) {
		
    	  
    	  Son s= new Son();
    	  s.display();
    	  s.money();
    	  s.home();
    	  s.car();
    	  
	}
      
      public void car() {
    	  System.out.println("car from Son");
      }

}
