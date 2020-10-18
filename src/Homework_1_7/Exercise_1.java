package Homework_1_7;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = 1;
        int num = in.nextInt();

        while (num >= 0) {
            count++;
            num = in.nextInt();
        }

        System.out.println(count);
    }
}
