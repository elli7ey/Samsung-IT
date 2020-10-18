package Homework_1_7;

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int c = 0;
        String N2 = "";

        while (N > 1){
            c = N / 2;
            N2 += N-2*c;
            N = c;
        }

        N2 += N;
        System.out.println(N2.length());
    }
}
