package Homework_1_7;

import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int min = 9;
        int i;

        while(N > 0){
            i = N%10;
            if (i < min && i>0){
                min=i;
            }
            N /= 10;
        }
        System.out.println(min);
    }
}
