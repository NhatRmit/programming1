import java.util.Scanner;

public class Exercise_3 {
    static void exe(){
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of seconds from mid-night: ");
        s = sc.nextInt();
        int h = s / 3600;  // there are 3600 seconds in 1 hour
        s = s % 3600;  // remaining seconds after extracting all whole hours
        int m = s / 60;  // there are 60 seconds in 1 minute
        s = s % 60;  // remaining seconds after extracting all whole minutes    
        System.out.println("Current time: " + h + ':' + m + ':' + s);
        sc.close();
    }
}
