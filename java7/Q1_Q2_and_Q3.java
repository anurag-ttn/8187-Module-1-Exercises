

record Student(int id , String name , int standard){
    public Student{
        if(name==null){
            throw new RuntimeException("name should not be null");
        }
        if(id<=0 || standard<=0 || standard>12){
            throw  new RuntimeException("These id or standard are not allow");
        }

    }
}

public class Q1_Q2_and_Q3 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Anurag",12);
        System.out.println(s1);

        Student s2 = new Student(1,"Anurag",12);
        System.out.println(s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
