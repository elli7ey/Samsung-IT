package Homework_1_11;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int cur;
        int ln=0;
        String del;
        int arr[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                arr[i][j] = i*j;
                cur = arr[i][j];

                if (cur == 0){
                    ln++;
                }

                while (cur > 0) {
                    cur /= 10;
                    ln++;
                }

                del = "";
                for(int l=0; l<4-ln; l++) {
                    del += " ";
                }

                System.out.print(del + arr[i][j]);
                ln = 0;
            }
            System.out.println();
        }
    }
}