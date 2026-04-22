abstract class smartDevice{
    int power;
    abstract void turnOn();
    abstract void turnOff();
    abstract void showPower();
}
class light extends smartDevice{
   int power=50;
    public void turnOn(){
        System.out.println("Power:"+ power+"W");
    }
    public void turnOff(){
        System.out.println("No power");
    }
    public void showPower(){
        System.out.println("Light:"+power+"W");
    }
}
class fan extends smartDevice{
    int power=75;
    public void turnOn(){
        System.out.println("Power:"+ power+"W");
    }
    public void turnOff(){
        System.out.println("No power");
    }
    public void showPower(){
        System.out.println("Fan:"+power+"W");
    }
}
class airConditioner extends smartDevice{
    int power=1500;
    public void turnOn(){
        System.out.println("Power:"+ power+"W");
    }
    public void turnOff(){
        System.out.println("No power");
    }
    public void showPower(){
        System.out.println("AirConditioner:"+power+"W");
    }
}


public class Task6 {
    public static void main(String[] args) {
 smartDevice[] sd={
         new light(),
         new fan(),
         new airConditioner()
 };
 for(smartDevice x:sd){
     x.turnOn();
     x.showPower();
     System.out.println();
 }
    }
}
