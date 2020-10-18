package Homework_1_8;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        int max = 0;

        for(int i=0; i<N; i++){
            a[i] = in.nextInt();
            if (a[i] > max){
                max = a[i];
            }
        }

        int b[] = new int[max];
        for (int i=0; i<N; i++){
            b[a[i]-1] += 1;
        }

        int min = 0;
        int index = 0;
        for (int i=0; i<N; i++){
            if (b[a[i]-1] > min){
                min = b[a[i]-1];
                index = a[i];
            }
        }

        System.out.println(index);

    }
}
