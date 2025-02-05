
interface Vehicle{
    public void drive();
}
class Car implements  Vehicle{
    public void drive(){
        System.out.println("car");
    }
}

class Bike implements Vehicle{
    public void drive(){
        System.out.println("Bike");
    }
}
class Factory{
    public static void getVehicle(String type){
        if(type.equals("bike")){
            new Bike().drive();
        }
        else if(type.equals("car")){
            new Car().drive();
        }

        else{
            System.out.print("Invalid Vehicle");
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        Factory.getVehicle("bike");
        Factory.getVehicle("car");
        Factory.getVehicle("truck");
    }
}
