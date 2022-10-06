package java10M.week1.day5.collection1006;

import java.util.HashMap;

public class MapAlphbetPractice {


    public static void main(String[] args) {

        String adress = "https://github.com/Universenn/Calculator".toLowerCase(); //소문자를 대문자로 변환

        HashMap<Character, Integer> map = new HashMap<>();
        // HashMap<String, Integer> alphaberMap = A~Z까지 등록

        // 1. 문자열 문자로 변경하기
        for (int i = 0; i < adress.length(); i++) {
            if(isAlphabet(adress.charAt(i))) {
//                System.out.println(adress.charAt(i)); // 문자열 문자로 변환
                map.put(adress.charAt(i), map.getOrDefault(adress.charAt(i),0)+1);
            }
        }
        System.out.println(map);
    }
    // 알파벳 구분
    public static boolean isAlphabet(char ch){
        return (ch>='a' && ch<='z')||(ch>='A'&& ch<='Z');
    }
}
