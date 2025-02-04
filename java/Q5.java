class Employee{
private int age;
private String fname;
private String lname;
private String designation;

public Employee(){
age = 0;fname="";lname="";designation="";
}
public Employee(int a , String f , String l , String d){
this.age=a;this.fname=f;this.lname=l;this.designation=d;
}
public void setAge(int a){this.age=a;}
public void setFname(String f){this.fname=f;}
public void setLname(String l){this.lname=l;}
public void setDesig(String d){this.designation=d;}

public String toString(){
return "name = "+fname+" Last name = "+lname+" age = "+age+" designation = "+designation;
}

}

public class Q5{
public static void main(String[] args){
	Employee e1 = new Employee();
	e1.setFname("ME");e1.setDesig("My designation");
	System.out.println(e1.toString());
	
	Employee e2 = new Employee(21,"anurag","kundu","desg");
	e2.setDesig("My obj2 designation");
	System.out.println(e2.toString());

}
}
