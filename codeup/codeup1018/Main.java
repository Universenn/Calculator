package java10M.week1.day5.codeup.codeup1018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] result = sc.nextLine().split(":");
        System.out.printf("%s:%s",result[0],result[1]);
    }
}
