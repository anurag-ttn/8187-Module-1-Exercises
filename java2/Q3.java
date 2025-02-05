
import java.io.File;
import java.util.*;
import java.util.HashMap;
import java.util.Map;


public class Q3 {


    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of file to count words with extension : ");
        String st = sc.nextLine();

        try{
            Scanner file = new Scanner(new File(st));
            while(file.hasNext()){
                String string = file.next();
                map.put(string, map.getOrDefault(string, 0) + 1);

            }
        }
        catch(Exception e){
            System.out.println("the file you want to count is  not found!");
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
