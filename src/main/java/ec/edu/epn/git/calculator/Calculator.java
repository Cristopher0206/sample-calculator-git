package ec.edu.epn.git.calculator;

public class Calculator {
    private int answers;
    public int addition(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double division(int a, int b){
        return a / b;
    }
    public void timeout(int time){
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public int getAnswers(){
        return answers;
    }
    public void setAnswers(int answers){
        this.answers = answers;
    }
}
