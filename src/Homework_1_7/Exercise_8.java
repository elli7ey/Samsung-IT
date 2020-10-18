package Homework_1_7;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int younger = 0;
        int i;

        while(N > 0){
            i = N % 10;
            if (i%2!=0){
                younger = i;
            }
            N /= 10;
        }

        if (younger > 0){
            System.out.println(younger);
        } else{
            System.out.println("NO");
        }

    }
}
