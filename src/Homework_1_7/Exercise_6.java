package Homework_1_7;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = 0;
        int i = 25;

        while (i < N){
            if (i%2==0){
                sum+=i;
            }
            i++;
        }

        System.out.println(sum);

    }
}
