package Homework_1_11;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[][] = new int[n][n];

        boolean flag = true;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array[i][j] = in.nextInt();
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i!=j){
                  if (array[i][j]!=array[j][i]){
                      flag = false;
                  }
                }
            }
        }

        if(flag){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
