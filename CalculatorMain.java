package java10M.week1.day5;

public class CalculatorMain {
    public static void main(String[] args) {
        int a=1,b=2;

        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(a,b));
        System.out.println(calculator.minus(a,b));
        System.out.println(calculator.multiple(a,b));
        System.out.println(calculator.divide(a,b));


    }
}
