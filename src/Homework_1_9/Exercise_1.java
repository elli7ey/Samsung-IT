package Homework_1_9;

import java.util.Scanner;

public class Exercise_1 {

    static int sum_n(int n){
        int sc = n%10;
        int fr = n/10;
        return sc + fr;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum_n(n));
    }
}
