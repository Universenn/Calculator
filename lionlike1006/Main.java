package java10M.week1.day5.lionlike1006;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        아기사자반 실습1 - 배열에 랜덤한 값 7개 채우기
//        배열 , 랜덤, 루프
//        int[] arr = new int[7];


        HashSet<Integer> set = new HashSet<>();
        while (set.size()<7){
            set.add((int)(Math.random()*10)+1);
        }
        System.out.println(set);
        Integer[] arr = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));


//        for (int i : arr) {
//            arr[i] = (int)(Math.random()*10)+1;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int i =0; i<arr.length; i++) {
//            arr[i] = (int)(Math.random()*10)+1;
//            for (int j =0; j<=i; j++){
//                if (arr[j] == arr[i]) {
//                    i--;
//                    break;
//                }
//            }
////            System.out.print(arr[i]+", ");
//
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
