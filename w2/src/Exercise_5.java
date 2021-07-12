public class Exercise_5 {
  static void exe(int points){
    System.out.printf("\nExercise 5 - Calculate PI using %d random points \n", points);
    int insideCount = 0;
    for (int i = 0; i < points; i++) {
      double x = Math.random() * 2 - 1;
      double y = Math.random() * 2 - 1;
      // if the point(x, y) is in the circle of radius 1
      // and its center is positioned at (0, 0)
      // we don't need to get the square root of (x * x + y * y)
      // because we just want to compare it with 1
      // if (x * x + y * y) > 1, then the same applies for its square root
      // and vice versa
      if (x * x + y * y <= 1) {
        insideCount++;
      }
    }
    System.out.printf("The approximate value of PI is %f", insideCount * 4.0 / points);
  }
}
