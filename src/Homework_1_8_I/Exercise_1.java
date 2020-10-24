package Homework_1_8_I;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String BinaryN = Integer.toBinaryString(N);
        char[] reversed_n = BinaryN.toCharArray();
        String result = "";
        for (int i = reversed_n.length -1; i>= 0; i--){
            result += reversed_n[i];
        }
        System.out.println(result);
    }
}
