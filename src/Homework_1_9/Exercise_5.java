package Homework_1_9;

import java.util.Scanner;

public class Exercise_5 {
    static double average(int[] arr){
        double sum=0;
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>999 && arr[i]<10000){
                sum+=arr[i];
                count++;
            }
        }
        if (count==0){
            return -1;
        } else {
            return sum / count;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int array[] = new int[N];
        for (int i=0; i<N; i++){
            array[i] = in.nextInt();
        }
        System.out.printf("%.2f", average(array));
    }
}
