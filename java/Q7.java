import java.util.*;

public class Q7{


public static void main(String[] args){


int number = 27;
int arr[] = {1,2,3,4};

Scanner sc = new Scanner(System.in);

try{
System.out.println("enter any number to divide number:"+number);
int num = sc.nextInt();
System.out.println(number/num);

System.out.println("enter array index to view");
int index = sc.nextInt();
System.out.println(arr[index]);

}catch(ArithmeticException e){
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
finally{
System.out.println("executed always ");
}

}
}
