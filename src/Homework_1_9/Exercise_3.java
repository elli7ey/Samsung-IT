package Homework_1_9;

import java.util.Scanner;

public class Exercise_3 {

    static int sum_thirteen(int n){
        int count = 0;
        for (int i=100; i<n; i++){
            int f = i/100;
            int s = i/10 % 10;
            int t = i%10;

            if ((f+s+t)%13==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(sum_thirteen(N));
    }
}
