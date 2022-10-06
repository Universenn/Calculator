package java10M.week1.day5.codeup.codeup1026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] result = sc.nextLine().split(":");
        System.out.println(Integer.parseInt(result[1]));
    }
}
