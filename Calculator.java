package java10M.week1.day5;
//Calculator클래스를 만들고
// plus minus multiple divide 4개의 메소드를 만들어보세요
//        각 메소드 기능은 + - * /이고
//        파라메터는 int a, int b 를 받습니다.
//        psvm만들지 않습니다.
//
//        CalculatorMain 클래스에서 실행 해보세요.
//        실행은 CalculatorMain에서 합니다.

public class Calculator {
        int a;
        int b;

        public Calculator(int a, int b) {
                this.a = a;
                this.b = b;
        }

        public int plus() {
                return a + b;
        }
        public int minus( ) {
                return a - b;
        }
        public int multiple() {
                return a * b;
        }
        public double divide() {
                return a / (double)b;
        }


}
