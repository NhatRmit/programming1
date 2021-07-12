public class Exercise_3 {
    public static boolean closeEnough(double d1, double d2) {
        // Specify what you think is close enough
        // It depends on your own problem
        double epsilon = 0.000001;
    
        return (Math.abs(d1 - d2) <= epsilon);
      }

    static void exe(double d){
        System.out.printf("\nExercise 3 - Calculate the square root of %f \n", d);
        double min = 0, max = d;
        double avg = (min + max) / 2;
        while (!closeEnough(avg * avg, d)) {
        if (avg * avg > d) {
            // too big
            max = avg;
        } else {
            // too small
            min = avg;
        }
        avg = (min + max) / 2;
        }
        System.out.printf("The square root of %f is %f \n", d, avg);
    }
}
