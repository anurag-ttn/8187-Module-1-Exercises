import java.util.HashMap;
import java.util.Map;
class Employees{
    int age;String name , desig;
    float salary;
    public Employees(int a , String n , String d , float sa){
        age =a; name= n ; desig = d;salary = sa;
    }
    public String toString() {
        return "name :"+name+" age : "+age+" designation : "+desig;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Employees e1 = new Employees(10,"Zsdef","desig 1",10000);
        Employees e2 = new Employees(20,"wrf","desig 2",12000);
        Employees e3 = new Employees(110,"abcf"," desig 3",15000);
        Map<Employees,Float> map = new HashMap<>();
        map.put(e1,e1.salary);
        map.put(e2,e2.salary);
        map.put(e3,e3.salary);

        for(Map.Entry<Employees,Float> entry : map.entrySet()){
            System.out.print(entry.getKey().name+"  :  "+entry.getValue());
        }
    }
}
