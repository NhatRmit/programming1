public class Exercise_2 {
    public static String buildLine(char c, int n) {
        // StringBuffer is mutable compared to String
        // As such, Java does not need to create many String objects
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
          sb.append(c);
          n--;
        }
        return sb.toString();
      }    

    static void exe(int n){
        System.out.printf("\nExercise 2 - Draw an empty square of length %d \n", n);
        // the first and last lines consist of all *
        String horLine = buildLine('*', n);
        // the other lines consist of 2 * at the left-most and right-most
        String otherLine = '*' + buildLine(' ', n - 2) + '*';
        for (int i = 0; i < n; i++) {
          if (i == 0 || i == n - 1) {
            System.out.println(horLine);
            // I use continue to skip the remaining code
            // So I don't need to use else
            continue;
          }
          System.out.println(otherLine);
        }
    }
    
}
