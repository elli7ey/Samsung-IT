package Homework_1_11;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int array[][] = new int[n][m];
        int cur;
        int ln=0;
        String del;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if (i%2==1){
                    array[i-1][j-1] = (i-1)*m+j-1;
                } else{
                    array[i-1][j-1] = i*m-j;
                }

                cur = array[i-1][j-1];

                if (cur == 0){
                    ln++;
                }

                while (cur > 0) {
                    cur /= 10;
                    ln++;
                }

                del = "";
                for(int l=0; l<3-ln; l++) {
                    del += " ";
                }

                System.out.print(del + array[i-1][j-1]);
                ln = 0;
            }
            System.out.println();
        }
    }
}
