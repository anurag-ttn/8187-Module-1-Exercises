enum Houses{
    House1(20000),
    House2(14000),
    House3(10000),
    House4(40000),
    House5(12000);

    int price ;
    Houses(int price){
        this.price = price;
    }

    int getPrice(){
        return price;
    }

}

public class Q1 {
    public static void main(String[] args) {
    for(Houses h : Houses.values()){
        System.out.println(h+" price : "+h.getPrice());
    }
    }
}