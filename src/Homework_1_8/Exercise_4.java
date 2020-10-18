package Homework_1_8;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        int p = 4;
        for(int i=0; i<N; i++){
            a[i] = p;
            p+=3;
            if (i+1 == N){
                System.out.print(a[i]);
            } else{
                System.out.print(a[i] + " ");
           }
        }
    }
}