package Homework_1_9;

import java.util.Scanner;

public class Exercise_2 {

    static void sum_seven(){
        int sum = 0;
        for (int i = 10; i<100; i++){
            if (i%7==0){
                int f = i/10;
                int s = i%10;
                sum+=f+s;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        sum_seven();
    }
}
