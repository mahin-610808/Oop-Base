class bankAccount{
    private double balance;
    public bankAccount(double initialBalance){
        if(initialBalance>0){
            balance=initialBalance;
        }else{
            balance=0;
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("Deposit successful");
        }
    }
    public void withdraw(double amount){
        if(amount<balance){
            balance -= amount;
            System.out.println("Withdraw done");
        }else{
            System.out.println("Not enough money");
        }
    }
    public double getBalance(){
        return balance;
    }
}



public class Banking {
    public static void main(String[] args) {
    bankAccount acc=new bankAccount(1000);
    acc.deposit(500);
    acc.withdraw(300);
        System.out.println("Current balance:"+acc.getBalance());
    }
}
