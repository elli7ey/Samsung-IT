package Homework_1_8_II;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0;
        int N = in.nextInt();
        int array[] = new int[N];

        for (int i = 0; i<N; i++){
            array[i] = in.nextInt();
            if (array [i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
