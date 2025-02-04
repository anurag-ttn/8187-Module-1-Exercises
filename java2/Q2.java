import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User{
    String fname,lname,Phone;
    int age;

    public User(String fn, String ln , String ph , int age){
        this.age=age;
        this.fname=fn;
        this.lname=ln;
        this.Phone = ph;
    }
}


public class Q2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       Scanner sc = new Scanner(System.in);
       boolean create = true;
       while(create){
           System.out.print("enter first name :");
           String fname = sc.nextLine();
           System.out.print("enter Last name :");
           String lname = sc.nextLine();
           System.out.print("enter phone number :");
           String ph = sc.nextLine();
           System.out.print("enter age :");
           int age  = sc.nextInt();
           sc.nextLine();
           User us = new User(fname,lname,ph,age);
           BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
           bw.write("name : "+us.fname+
                   "\n last name : "+us.lname+
                   "\n phone number : "+us.Phone+
                   "\n age : "+us.age);

           System.out.print("Do you want to continue! press Quit to Exit else any other key");
           String st = sc.nextLine();
           if((st.equals("QUIT") || st.equals("quit"))){
               create = false;
           }
           bw.close();
       }

    }
}
