import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String fullName;
    Long salary;
    String city;

    public Employee(String fn , Long s , String c){
        fullName=fn;
        salary =s;
        city = c;
    }
}


public class Q5 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("anurag kundu",500000L,"faridabad"));
        list.add(new Employee("xyz abc",500L,"delhi"));
        list.add(new Employee("anurag kundu",600L,"delhi"));
        list.add(new Employee("yagwydwd ydhwd",500L,"noida"));
        list.add(new Employee("first iddle last",500000L,"delhi"));

        List<String> namelist = new ArrayList<>();
        namelist = list.stream()
                .filter(e->e.salary<5000 && e.city.equals("delhi"))
                .map(e->e.fullName)
                .collect(Collectors.toList());

        System.out.println(namelist);

    }
}
