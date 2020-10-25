package Homework_1_8_II;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        int check[] = new int[N];
        int count = 0;
        boolean flag = true;
        boolean was_zero = true;

        for(int i=0; i<N; i++){
            arr[i] = in.nextInt();

            if (arr[i] == 0 && was_zero){
                count++;
                was_zero = false;
            }

            for (int j=0; j<N; j++){
                if (check[j] == arr[i]){
                    flag = false;
                }
            }

            if (flag){
                check[i] = arr[i];
                count++;
            } else{
                flag = true;
            }
        }
        System.out.println(count);

    }
}
