package Lessons;

import java.util.Scanner;

public class Lessonfile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int a[] = new int[10];
        int n;

        for (int i=0; i<10; i++){
            a[i] = in.nextInt();
        }

        for (int i=0; i<5; i++){
                n = a[i];
                a[i] = a[9-i];
                a[9-i] = n;
        }

        for (int i=0; i<10; i++){
            System.out.println(a[i]);
        }


}
}