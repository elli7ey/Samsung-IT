package Homework_1_8;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < N; i++){
            a[i] = in.nextInt();
            if (a[i] % 2 == 0){
                sum+=a[i];
                flag=true;
            }
        }

        if (flag){
            System.out.println(sum);
        } else{
            System.out.println("NO");
        }
    }
}
