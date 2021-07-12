public class Exercise_4 {       
    static void exe(double S, int n){
        System.out.printf("\nExercise 4 - Calculate contributions of %d people for %.2f dollar \n", n, S);
        int money = (int)(S * 100);
        int least = money / n;
        int remainder = money % n;
        if (remainder == 0) {
          System.out.printf("Each person pays %.2f \n", least / 100.0);
        } else {
          // remainder = X means X people have to pay 0.01 more than the others
          // You are in the second group, because you are the organizer :)
          System.out.printf("%d person pay %.2f each \n", remainder, (least + 1) / 100.0);
          if (n - remainder - 1 > 0) {
            // there is at least one person pays the same as you
            System.out.printf("You and %d other pay %.2f each \n", n - remainder - 1, least / 100.0);
          } else {
            System.out.printf("You pay %.2f \n", least / 100.0);
          }
        }
    }  
}
