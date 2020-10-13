package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = 0;

        if (a+b>c && a+c>b && b+c>a){
            if (a >= b && a >= c){

                sum = b*b + c*c;
                if (sum == a*a){
                    System.out.println("right");
                } else if (sum > a*a){
                    System.out.println("obtuse");
                } else {
                    System.out.println("acute");
                }

            } else if (b >= a && b >= c){

                sum = a*a + c*c;
                if (sum == b*b){
                    System.out.println("right");
                } else if (sum > b*b){
                    System.out.println("obtuse");
                } else {
                    System.out.println("acute");
                }

            } else {

                sum = a*a + b*b;
                if (sum == c*c){
                    System.out.println("right");
                } else if (sum > c*c){
                    System.out.println("obtuse");
                } else {
                    System.out.println("acute");
                }

            }
        } else {
            System.out.println("impossible");
        }


    }   
}