
public class Q6{
public static void main(String[] args){
    SBI sbi = new SBI();
    ICICI ic = new ICICI();
    BOI ban = new BOI();

    sbi.setFields();
    ic.setFields();
    ban.setFields();
    System.out.println(sbi.toString());
    System.out.println(ic.toString());
    System.out.println(ban.toString());
}
}
