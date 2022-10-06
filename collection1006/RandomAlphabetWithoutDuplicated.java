package java10M.week1.day5.collection1006;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        // RandomNumberGenerator 생성자를 추가 해줬다. 파라미터 추가 및 return 값 변경
        char alphabetA = 'A';  // char : 65 = A
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(); // 객체 생성
        Set<Character> setChar =new HashSet<>();  // hashset은 set인터페이스, 구현 클래스다.
        for (int i = 0; i<25; i++) {  // 랜덤으로 뽑을 개수
            setChar.add((char) randomNumberGenerator.make(26,alphabetA)); // 아스키 코드 알파벳 범위 (65~90)
        }
        System.out.println(setChar);
        System.out.println("개수 : "+setChar.size());

    }
}
