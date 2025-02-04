import java.util.*;

public class Q3{


static void AreaofCircle(float r){
 System.out.println("Area of circle : "+3.14*r*r);
}

static void Circumfrence(float r){
System.out.print("circumfrence of circle :"+2*3.14*r);
}

public static void main(String args[]){

Scanner sc =new Scanner(System.in);
float r = sc.nextFloat();

System.out.println("enter your choice \n 1.. print area \n 2.. print circumfrence \n 3.. exit");
int choice = sc.nextInt();
switch(choice){
case 1:AreaofCircle(r);break;
case 2:Circumfrence(r);break;
default:break;
}



}

}
