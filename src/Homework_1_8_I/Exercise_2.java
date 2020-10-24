package Homework_1_8_I;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        int el;
        for (int i = 0; i<N; i++){
            if (i+1==N){
                for (int j = 0; j < N; j++){
                    if (a[j] == 0){
                        System.out.println(j+1);
                        break;
                    }
                }
            } else {
                el = in.nextInt();
                a[el-1] = el;
            }
        }

    }
}
