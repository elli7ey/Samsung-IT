package Homework_1_8;

import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        double sum = 0;
        int count = 0;
        double res;
        boolean flag = false;

        for (int i = 0; i < N; i++){
            a[i] = in.nextInt();
            if (a[i] % 2 != 0){
                sum+=a[i];
                count++;
                flag=true;
            }
        }

        if (flag){
            res = sum / count;
            System.out.println(String.format("%.2f", res));
        } else{
            System.out.println("NO");
        }
    }
}
