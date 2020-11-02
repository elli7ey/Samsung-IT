package Homework_1_9_I;

import java.util.Scanner;

public class Exercise_1 {
    static double perimeter(double xA, double yA, double xB, double yB, double xC, double yC){
        double AB = Math.sqrt((xA-xB)*(xA-xB) + (yA-yB)*(yA-yB));
        double BC = Math.sqrt((xB-xC)*(xB-xC)+(yB-yC)*(yB-yC));
        double AC = Math.sqrt((xA-xC)*(xA-xC)+(yA-yC)*(yA-yC));
        return AB+BC+AC;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double  xA = in.nextDouble(), yA = in.nextDouble(), xB = in.nextDouble(), yB = in.nextDouble(), xC = in.nextDouble(), yC = in.nextDouble();
        System.out.printf("%.10f", perimeter(xA, yA, xB, yB, xC, yC));
    }
}
