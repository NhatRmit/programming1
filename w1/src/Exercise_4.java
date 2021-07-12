import java.util.Scanner;

public class Exercise_4 {
    static double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
          
    static void exe(){
        double xA, yA, xB, yB;
        Scanner sc = new Scanner(System.in);
        System.out.print("xA: ");
        xA = sc.nextDouble();
        System.out.print("yA: ");
        yA = sc.nextDouble();
        System.out.print("xB: ");
        xB = sc.nextDouble();
        System.out.print("yA: ");
        yB = sc.nextDouble();
        double l = length(xA, yA, xB, yB);
        System.out.println("Length of AB: " + l);
        System.out.println("Circumference: " + (l * 4));
        System.out.println("Area: " + (l * l));
        sc.close();
    }  
}
