abstract class Exam{
    abstract void startExam();
    abstract void evaluate();
    abstract  void showResult();
}
class ProgrammingExam extends Exam{
    int mark=85;
    public void startExam(){
        System.out.println("Programming Exam will Started");
    }
    public  void evaluate(){


        System.out.println("Evaluation based on correct output and test cases");
    }
    public void showResult(){

        System.out.println("Programming Exam = " + mark + " " + "marks");
    }
}
class TheoryExam extends Exam{
    int mark=78;
    public void startExam(){
        System.out.println("Theory Exam will Started");
    }
    public  void evaluate(){


        System.out.println("Evaluation based on written answers");
    }
    public void showResult(){

        System.out.println("Theory Exam = " + mark + " " + "marks");
    }
}

class VivaExam extends  Exam{
    int mark=90;
    public void startExam(){
        System.out.println("Viva Exam will Started");
    }
    public  void evaluate(){


        System.out.println("Evaluation based on oral performance");
    }
    public void showResult(){

        System.out.println("Viva Exam = " + mark + " " + "marks");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Exam[] e={new ProgrammingExam(),
                new TheoryExam(),
                new VivaExam()
        };
        for(Exam x:e){
            x.startExam();
            x.evaluate();
            x.showResult();
            System.out.println();
        }
    }
}
