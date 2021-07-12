import java.util.Scanner;

public class Exercise_5 {
    static double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
      }

    static void exe(){
        double xA, yA, rA, xB, yB, rB;
        Scanner sc = new Scanner(System.in);
        System.out.print("xA: ");
        xA = sc.nextDouble();
        System.out.print("yA: ");
        yA = sc.nextDouble();
        System.out.print("Radius of circle A: ");
        rA = sc.nextDouble();
        System.out.print("xB: ");
        xB = sc.nextDouble();
        System.out.print("yA: ");
        yB = sc.nextDouble();
        System.out.print("Radius of circle B: ");
        rB = sc.nextDouble();
        double l = length(xA, yA, xB, yB);
        if (rA + rB >= l && Math.abs(rA - rB) <= l) {
          System.out.println("Intersected");
        } else {
          System.out.println("Not intersected");
        }
        sc.close();
    }
}
