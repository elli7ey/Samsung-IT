package Homework_1_9;

import java.util.Scanner;

public class Exercise_6 {
    static int[] sorting(int[] arr){
        int res_arr[] = new int[arr.length];
        int min = arr[0];
        int min_i = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
                min_i = i;
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (i==min_i){
                res_arr[0] = arr[i];
            } else if (i<min_i) {
                res_arr[i+1] = arr[i];
            } else if (i>min_i){
                res_arr[i] = arr[i];
            }
        }
        return res_arr;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = in.nextInt();
        }
        array = sorting(array);
        for (int i = 0; i < N; i++){
            if (i+1 == N){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
