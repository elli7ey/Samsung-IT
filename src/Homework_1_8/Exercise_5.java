package Homework_1_8;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        int p;
        for (int i=0; i<N; i++){
            a[i] = in.nextInt();
        }
        for (int i=0; i<N/2; i++){
            p = a[i];
            a[i] = a[N-1-i];
            a[N-1-i] = p;
        }
        for (int i=0; i<N; i++){
            System.out.println(a[i]);
        }
    }
}
