package Homework_1_8_II;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int array[] = new int[N];

        for (int i=0; i<N; i++){
            array[i] = in.nextInt();
        }

        for (int i=0; i<N; i++){
            if (array[i] % 2 == 0){
                if (i+1 == N){
                    System.out.print(array[i]);
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
