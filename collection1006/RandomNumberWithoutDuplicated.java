package java10M.week1.day5.collection1006;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> numbers =new HashSet<>();
        for (int i = 0; i<10; i++) {
            int r = randomNumberGenerator.make(10);
            numbers.add(r);

        }
        System.out.println(numbers);
        System.out.println("개수 : "+numbers.size());

    }
}
