abstract class GameCharacter{

    abstract void attack();
    abstract void displayStatus();
}
class Warrior extends GameCharacter{
    int power=50;
    int attack=2;
    int damage;
    public void attack(){
        damage=power*attack;
        System.out.println("Damage:"+damage);
    }
    public void displayStatus(){
        System.out.println("Warrior:power="+power);
    }
}
class Mage extends GameCharacter{
    int power=40;
    int attack=3;
    int damage;
    public void attack(){
        damage=power*attack;
        System.out.println("Damage:"+damage);
    }
    public void displayStatus(){
        System.out.println("Mage:power="+power);
    }
}
class Archer extends GameCharacter{
    int power=35;
    float attack= 1.5F;
    int damage;
    public void attack(){
        float damage=power*attack;
        System.out.println("Damage:"+damage);
    }
    public void displayStatus(){
        System.out.println("Archer:power="+power);
    }
}

public class Task7 {
    public static void main(String[] args) {
 GameCharacter[] gc={
         new Warrior(),
         new Mage(),
         new Archer()
 };
 for(GameCharacter x:gc){
     x.attack();
     x.displayStatus();
     System.out.println();
 }
    }
}
