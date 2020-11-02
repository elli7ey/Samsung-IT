package Lessons;

import java.util.Scanner;
public class Lessonfile {

    static int[] ask_array(int n) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите элементы массива: ");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    static void print_array(int[] ar) {
        System.out.print("Ваш массив: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    static boolean ismultiple(int n) {
        int sum = 0;

        while(n>0){
            sum += n%10;
            n/=10;
        }

        if (sum % 13 == 0){
            return true;
        } else {
            return false;
        }
    }

    static int counter(int n){
        int count = 0;
        for (int i = 100; i < n; i++){
            if (ismultiple(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a=10;
        System.out.println(counter(999));
    }
}
