package Homework_1_8;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        boolean flag = true;
        for (int i=0; i<N; i++){
            a[i] = in.nextInt();
        }
        int X = in.nextInt();

        for (int i=0; i<N; i++){
            if (a[i] == X){
                System.out.println(i+1);
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("NO");
        }

    }
}
