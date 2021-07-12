public class Exercise_1 {
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
    System.out.printf("\nExercise 1 - Draw a solid square of length %d \n", n);
    String line = buildLine('*', n);
    while (n > 0) {
      System.out.println(line);
      n--;
    }
  }
}
