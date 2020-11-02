package Homework_1_11;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        int array[][] = new int[N][M];
        int turned_array[][] = new int[M][N];

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                array[i][j] = in.nextInt();
            }
        }

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                turned_array[j][N-1-i] = array[i][j];

            }
        }

        System.out.println(M + " " + N);
        for(int i=0; i<M; i++){
            for (int j=0; j<N; j++){
                if (j+1 == N){
                    System.out.print(turned_array[i][j]);
                } else {
                    System.out.print(turned_array[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
