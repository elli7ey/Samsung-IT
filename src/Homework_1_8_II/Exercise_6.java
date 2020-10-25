package Homework_1_8_II;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        arr[0] = in.nextInt();
        int max = arr[0];

        for (int i = 1; i<N; i++){
            arr[i] = in.nextInt();
            if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
