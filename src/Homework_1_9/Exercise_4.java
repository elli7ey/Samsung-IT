package Homework_1_9;

import java.util.Scanner;

public class Exercise_4 {

    static String binary_discharge(double x, int n){
        String res = "";
        double step_n;
        for (int i = 0; i < n; i++){
            step_n = x*2;
            if (step_n >= 1){
                res += 1;
                x = step_n-1;
            } else{
                res += 0;
                x = step_n;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();
        int N = in.nextInt();
        System.out.println(binary_discharge(X, N));
    }
}
