abstract  class Loan{
    int loanAmount=100000;
    abstract void calculateInterest();
}
class HomeLoan extends Loan{
    double interestRate=0.08;
    public void calculateInterest(){
        double interest=(loanAmount*interestRate);
        System.out.println("HomeLoan Interest = "+ (int)interest+" "+ "BDT");
    }
}
class CarLoan extends Loan{
    int loanAmount=100000;
    double interestRate=0.1;
    public void calculateInterest(){
        double interest=(loanAmount*interestRate);
        System.out.println("CarLoan Interest = "+ (int)interest+" "+"BDT");
    }
}
class EducationLoan extends Loan{
    int loanAmount=100000;
    double interestRate=0.06;
    public void calculateInterest(){
        double interest=(loanAmount*interestRate);
        System.out.println("EducationLoan Interest = "+ (int)interest+" "+"BDT");
    }
}

public class Task5 {
    public static void main(String[] args) {
        Loan[] l={
                new HomeLoan(),
                new CarLoan(),
                new EducationLoan()
        };
        for(Loan x:l){
            x.calculateInterest();
            System.out.println();
        }
    }
}
