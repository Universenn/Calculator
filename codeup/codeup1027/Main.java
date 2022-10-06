package java10M.week1.day5.codeup.codeup1027;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] result = sc.nextLine().split("[.]");
        System.out.println(result[2]+"-"+result[1]+"-"+result[0]);
    }
}
