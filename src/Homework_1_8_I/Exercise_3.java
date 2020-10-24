package Homework_1_8_I;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[][] = new int[N][N];
        for (int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = N*i + j + 1;
            }
        }

        for (int i = 0; i < N; i++) {
            if (i + 1 == N) {
                System.out.print(arr[i][i]);
            } else {
                System.out.print(arr[i][i] + " ");
            }
        }
    }
}