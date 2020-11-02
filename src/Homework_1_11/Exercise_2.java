package Homework_1_11;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i+j==n-1){
                    arr[i][j] = 1;
                } else if(i+j<n-1){
                    arr[i][j] = 0;
                } else if (i+j>n-1){
                    arr[i][j] = 2;
                }
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j+1==n){
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
