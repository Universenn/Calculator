package java10M.week1.day5.calculator;

public class Calculator_1 {
    private NumberMaker_1 numberMaker;

    public Calculator_1(NumberMaker_1 numberMaker) {
        this.numberMaker = numberMaker;
    }

    //======================================================================

    public void plus(int num) {
        int result = num + this.numberMaker.make(10);
        System.out.println(result);
    }
    public void minus(int num) {
        int result = num - this.numberMaker.make(10);
        System.out.println(result);
    }
    public void mul(int num) {
        int result = num * this.numberMaker.make(10);
        System.out.println(result);
    }
    public void div(int num) {
        double result = num / (double)this.numberMaker.make(10);
        System.out.println(result);
    }

}
