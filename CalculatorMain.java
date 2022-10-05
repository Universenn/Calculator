package java10M.week1.day5;

public class CalculatorMain {
    public static void main(String[] args) {


        Calculator calculator = new Calculator(3,5);

        System.out.println(calculator.plus());
        System.out.println(calculator.minus());
        System.out.println(calculator.multiple());
        System.out.println(calculator.divide());

    }
}
