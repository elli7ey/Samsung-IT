package Homework_1_7;

import java.util.Scanner;

public class Exercise_10 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt()+1;
        int var = 2;
        while(true){
            if (n % var != 0){
                var++;
            } else if (n % var == 0){
                if(var == n){
                    System.out.println(n);
                    break;
                } else {
                    var = 2;
                    n++;
                }
            }
        }
    }
}
