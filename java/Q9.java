
class MyException extends  Exception{
    public MyException(String s) {
        super(s);
    }public Throwable fillInStackTrace() {
        return this;
    }
}
public class Q9 {
    public static void main(String[] args) {
        try{
            throw new MyException("throwing custom exception :");
        }catch(MyException e){
            System.out.println("my exception :- "+e.getMessage());
            e.printStackTrace();
        }
    }
}
