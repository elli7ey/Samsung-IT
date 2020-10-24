package Lessons;

import java.util.Scanner;

public class Lessonfile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][5];
        double count_even = 0, count_odd = 0;

        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                arr[i][j] = in.nextInt();
                if (arr[i][j] % 2 == 0){
                    count_even++;
                } else {
                 count_odd++;
                }
            }
        }

        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        if (count_even > count_odd){
            System.out.println("More even numbers. Even: " + count_even + " Odd: " + count_odd);
        } else{
            System.out.println("More odd numbers. Odd: " + count_odd + " Even: " + count_even);
        }
}
}