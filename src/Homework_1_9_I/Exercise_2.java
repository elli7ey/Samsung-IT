package Homework_1_9_I;

import java.util.Scanner;

public class Exercise_2 {
    static int min (int a, int b, int c, int d){
        if (a<=b && a<=c && a<=d){
            return a;
        } else if (b<=a && b<=c && b<=d){
            return b;
        } else if (c <= a && c <= b && c <= d){
            return c;
        } else {
            return d;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println(min(a, b, c, d));
    }
}
