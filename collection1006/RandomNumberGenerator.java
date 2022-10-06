package java10M.week1.day5.collection1006;

public class RandomNumberGenerator implements RandomNumber{
    @Override
    public int make(int num) {
        return (int)(Math.random()*num)+1;
    }
    public int make(int num, int a) {
        return make(num)+a;
    }
}
