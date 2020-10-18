package Homework_1_7;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;

        while(N > 0){
            count++;
            N /= 10;
        }

        System.out.println(count);


    }
}
