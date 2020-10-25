package Homework_1_8_II;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), a=in.nextInt(), b=in.nextInt(), c=in.nextInt(), d=in.nextInt();
        int x[] = new int[n + 1];
        int y[] = new int[n + 1];
        // 9 2 5 6 9
        // 1 2 3 4 5 6 7 8 9
        // 1 2 3 4 5 6 7 8 9
        // 0 1 2 3 4 5 6 7 8

        for (int i = 1; i <= n; i++) {
            x[i] = i;
            y[i] = x[i];
        }
        for (int i = 0; i <= b - a; i++) { // 0 1 2 3
            x[a + i] = y[b - i];
        }

        for (int i = 1; i <= n; i++) {
            y[i] = x[i];
        }

        for (int i = 0; i <= d - c; i++) {
            x[c + i] = y[d - i];
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
