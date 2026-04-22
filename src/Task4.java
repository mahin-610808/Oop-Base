abstract class RideService{
    abstract void requestRide();
    abstract void calculateFare();
    abstract void showRideDetails();
}
class BikeRide extends RideService{
    int distance=10;
    int baseFare=50;
    int ridePerKm=10;
    double Fare;
    public void requestRide(){
        System.out.println("Bike ride request");
    }
    public void  calculateFare(){
        Fare=baseFare+(distance*ridePerKm);
        System.out.println("Fare ="+Fare + "tk");
    }
    public void showRideDetails(){
        System.out.println("Bike Ride = "+ ridePerKm + " " + "tk" + " "+ "per km");
        System.out.println("Distance = "+ distance + "km");
    }
}
class CarRide extends RideService{
    int distance=10;
    int baseFare=50;
    int ridePerKm=20;
    double Fare;
    public void requestRide(){
        System.out.println("Car ride request");
    }
    public void  calculateFare(){
        Fare=baseFare+(distance*ridePerKm);
        System.out.println("Fare ="+Fare + "tk");
    }
    public void showRideDetails(){
        System.out.println("Car Ride = "+ridePerKm + " "+ "tk"+ " "+ "per km");
        System.out.println("Distance = "+ distance+ "km");
    }
}
class LuxuryRide extends RideService{
    int distance=10;
    int baseFare=50;
    int ridePerKm=35;
    double Fare;
    public void requestRide(){
        System.out.println("Luxury ride request");
    }
    public void  calculateFare(){
        Fare=baseFare+(distance*ridePerKm);
        System.out.println("Fare ="+Fare + "tk");
    }
    public void showRideDetails(){
        System.out.println("Luxury Ride = "+ridePerKm + " "+ "tk"+ " "+ "per km");
        System.out.println("Distance = "+ distance+ "km");
    }
}

public class Task4 {
    public static void main(String[] args) {
        RideService[] rb = {
                new BikeRide(),
                new CarRide(),
                new LuxuryRide()

        };
        for(RideService r:rb){
            r.requestRide();
            r.calculateFare();
            r.showRideDetails();
            System.out.println();
        }

    }
}

