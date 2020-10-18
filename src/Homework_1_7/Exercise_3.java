package Homework_1_7;

import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num = in.nextInt();
        int f;
        int s;

        while(num > 9 && num < 100){
            f = num / 10;
            s = num % 10;
            sum += f+s;
            num = in.nextInt();
        }

        System.out.println(sum);
    }
}
