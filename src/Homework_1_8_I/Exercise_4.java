package Homework_1_8_I;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int res = 1;
        for (int i=1; i<=N; i++){
            res *= i;
        }
        System.out.println(res);
    }
}
