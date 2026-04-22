
abstract class Delivery{

    abstract void calculateCharge();
}
class BikeDelivery extends Delivery{
    int distance=15;
    int rate=8;
    public void calculateCharge(){
        int charge=distance*rate;
        System.out.println("Charge:"+charge);
        System.out.println("Bike:"+rate+" per km");
    }
}
class CarDelivery extends Delivery{
    int distance=15;
    int rate=15;
    public void calculateCharge(){
        int charge=distance*rate;
        System.out.println("Charge:"+charge);
        System.out.println("Car:"+rate+" per km");
    }
}
class DroneDelivery extends Delivery{
    int distance=15;
    int rate=25;
    public void calculateCharge(){
        int charge=distance*rate;
        System.out.println("Charge:"+charge);
        System.out.println("Drone:"+rate+" per km");
    }
}

public class Task8 {
    public static void main(String[] args) {
        Delivery[] d={
                new BikeDelivery(),
                new CarDelivery(),
                new DroneDelivery()
        };
        for(Delivery x:d){
            x.calculateCharge();
            System.out.println();
        }
    }
}
