package java10M.week1.day5.codeup.codeup1024;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();

        for (int i = 0; i<result.length();i++){
            char a = result.charAt(i);
            System.out.println("'"+a+"'");
        }

    }
}