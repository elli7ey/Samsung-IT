package Homework_1_8;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        int subzerocount = 0;
        for (int i=0; i<N; i++){
            a[i] = in.nextInt();
            if(a[i] < 0){
                subzerocount++;
            }
        }

        int subzero[] = new int[subzerocount];
        int afterzero[] = new int[N-subzerocount];
        int szi = 0;
        int azi = 0;
        for (int i=0; i<N; i++){
            if (a[i] < 0){
                subzero[szi] = a[i];
                szi++;
            } else {
                afterzero[azi] = a[i];
                azi++;
            }
        }

        for (int i=0; i<szi; i++){
            System.out.print(subzero[i] + " ");
        }

        for (int i=0; i<azi; i++){
            System.out.print(afterzero[i] + " ");
        }

    }
}
