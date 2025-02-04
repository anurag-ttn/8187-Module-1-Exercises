
public class Q1{
	static int age = 21;
	static String FirstName = "Anurag";
	static String LastName = "kundu";
	
	static{
	System.out.println("First Name = "+FirstName);
	}
	
	static void output(){
	System.out.println("Last Name = "+LastName);
	}
	
	
	public static void main(String[] args){

	
	Q1.output();
	
	System.out.println("age = "+Q1.age);
	
	}

}
