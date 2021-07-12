public class Exercise_2 {
    static void exe(){
        int x = 10, y = 20;
        System.out.println("x and y before swapping: " + x + ", " + y);
        int tmp;
        // swawpping logic here
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x and y after swapping: " + x + ", " + y);
    }
    
}
