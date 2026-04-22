abstract class Restaurant{
    abstract void placeOrder();
    abstract void prepareFood();
    abstract void estimateDeliveryTime();
}
class FastFoodRestaurant extends Restaurant {

    public void placeOrder() {
        System.out.println("Fast food Order in place");
    }


    public void prepareFood() {
        System.out.println("Fast Food is prepared quickly");
    }

    public void estimateDeliveryTime() {
        int minutes = 20;
        System.out.println("Fast food delivery time is" + " " + minutes + " " +"minutes");
    }
}

class TraditionalRestaurant extends Restaurant{
    public void placeOrder() {
        System.out.println("Traditional food Order in place");
    }


    public void prepareFood() {
        System.out.println("Traditional Food is Freshly cooked");
    }

    public void estimateDeliveryTime() {
        int minutes = 45;
        System.out.println("Traditional food delivery time is"+" " + minutes + " " + "minutes");
    }
}

class DessertShop extends Restaurant{
    public void placeOrder() {
        System.out.println("Desert item Order in place");
    }


    public void prepareFood() {
        System.out.println("Desert item require decoration and preparation.");
    }

    public void estimateDeliveryTime() {
        int minutes = 30;
        System.out.println("Desert item delivery time is" + " " + minutes + " " + "minutes");
    }
}

public class Task2 {
    public static void main(String[] args) {
//        FastFoodRestaurant fr=new FastFoodRestaurant();
//        TraditionalRestaurant tr=new TraditionalRestaurant();
//        DessertShop ds=new DessertShop();
//
//        fr.placeOrder();
//        fr.prepareFood();
//        fr.estimateDeliveryTime();
//
//        System.out.println();
//
//        tr.placeOrder();
//        tr.prepareFood();
//        tr.estimateDeliveryTime();
//
//        System.out.println();
//
//        ds.placeOrder();
//        ds.prepareFood();
//        ds.estimateDeliveryTime();

        Restaurant[] r = {
                new FastFoodRestaurant(),
                new TraditionalRestaurant(),
                new DessertShop()
        };

        for(Restaurant x : r){
            x.placeOrder();
            x.prepareFood();
            x.estimateDeliveryTime();
            System.out.println();
        }

    }
}

