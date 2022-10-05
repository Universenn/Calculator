package java10M.week1.day5.calculator;

public class RandomNumberMaker_1 implements NumberMaker_1{
    @Override
    public int make(int num) {
        return (int)(Math.random()*10)+1;
    }
}
