package java10M.week1.day5.calculator;

public class Main_1 {
    public static void main(String[] args) {

        NumberMaker_1 numberMaker_1 = new RandomNumberMaker_1();

        Calculator_1 randomcalculator_1 = new Calculator_1(numberMaker_1);

        randomcalculator_1.plus(20);
        randomcalculator_1.minus(20);
        randomcalculator_1.mul(20);
        randomcalculator_1.div(20);
    }
}
