package Homework_1_8_II;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int array[] = new int[N];
        int count = 0;
        array[0] = in.nextInt();
        for(int i=1; i<N; i++){
            array[i] = in.nextInt();
            if(array[i] > array[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
