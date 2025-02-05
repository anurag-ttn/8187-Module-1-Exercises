import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Employee implements Comparable<Employee>{
    double age;
    double salary;
    String name;

    public Employee(double a , double s , String n){
        age = a;
        salary = s;
        name = n;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareToIgnoreCase(employee.name);
    }

    public String toString(){
        return "name : "+this.name+" age : "+this.age+" salary : "+this.salary;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(10,10000,"Zsdef");
        Employee e2 = new Employee(20,10400,"wrf");
        Employee e3 = new Employee(110,10200,"abcf");
        Employee e4 = new Employee(102,100,"def");
        Employee e5 = new Employee(40,1100,"vdef");
        List<Employee> list = new ArrayList<>();
        list.add(e1);list.add(e2);
        list.add(e3);list.add(e4);list.add(e5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,new MyCustomCompare() );
        System.out.print(list);
    }
}
