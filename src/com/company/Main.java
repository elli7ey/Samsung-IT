package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int count = 0;
        int N = in.nextInt();

        for (int i=0; i<N; i++){
            a[i] = in.nextInt();
        }

        for (int i=1; i<N; i++){
            if (a[i] > 0 && a[i-1] > 0 || a[i] < 0 && a[i-1] < 0){
                count++;
            }
        }

        System.out.println(count);

    }   
}