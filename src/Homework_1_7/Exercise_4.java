package Homework_1_7;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int c = 0;
        while(A >= B){
            A-=B;
            c+=1;
        }
        System.out.println(c + " " + A);

    }
}
