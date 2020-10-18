package Homework_1_7;

import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            num = in.nextInt();
            if (num>10){
                sum += num;
            }
        } while (num%5!=0);

        System.out.println(sum);
    }
}
