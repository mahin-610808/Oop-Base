abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    abstract void showStatus();

}
class Light extends SmartDevice{
    int brightness;
    public void turnOn(){
        brightness=70;
        System.out.println("Light Turned on!");
    }
    public void turnOff(){
        brightness=0;
        System.out.println("Light Turned off!");
    }
    public void showStatus(){
        System.out.println("Brightness is = "+brightness +"%");

    }

}
class Fan extends SmartDevice{
    int speed;
    public void turnOn(){
        speed=3;
        System.out.println("Running at speed!");
    }
    public void turnOff(){
        speed=0;
        System.out.println("Less !");
    }
    public void showStatus(){
        System.out.println("Running speed at = "+speed);

    }
}
class AirConditioner extends SmartDevice{
    float temp;
    public void turnOn(){
        temp=24;
        System.out.println("Temperature on!");
    }
    public void turnOff(){
        temp=0;
        System.out.println("Temperature off!");
    }
    public void showStatus(){
        System.out.println("Temperature cooling = "+temp+"C");

    }
}



public class Task1 {
    public static void main(String[] args) {
//        Light l=new Light();
//        Fan f=new Fan();
//        AirConditioner ac=new AirConditioner();
//        l.turnOn();
//       // l.turnOff();
//        l.showStatus();
//        f.turnOn();
//        //f.turnOff();
//        f.showStatus();
//        ac.turnOn();
//        //ac.turnOff();
//        ac.showStatus();
        //polymorphism
        SmartDevice [] sd={new Light(),
                new Fan(),
                new AirConditioner()
        };
        for(SmartDevice x : sd){
            x.turnOn();
            x.showStatus();
            System.out.println();
        }

    }
}
