package Inheritenance;

public class Daughter extends father {

	String dname="Mona";
	int num=1;
	
	public static void main(String[] args) {
		
		Daughter d= new Daughter();
		d.display();
         d.daughterd();
		
	}
	
	public void daughterd(){
		
		System.out.println("Daughter name:" +dname);
		System.out.println("Daughter number:" +num);
		
		}
	

}
