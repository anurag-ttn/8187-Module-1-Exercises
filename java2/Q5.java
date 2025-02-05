

class DbConnection{
    public static DbConnection myconn;
    public DbConnection(){
    }
    public static DbConnection getConnection(){
        if(myconn==null){
            myconn = new DbConnection();
        }
        return myconn;
    }
    public void checkObject(){
        System.out.println(this);
    }
}
public class Q5 {
    public static void main(String[] args) {
        DbConnection con1 = DbConnection.getConnection();
        DbConnection con2 = DbConnection.getConnection();
        con1.checkObject();
        con2.checkObject();
        System.out.println(con1==con2);
    }
}
