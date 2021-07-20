import java.util.Scanner;
import java.util.Random;
public class Array_String {

    public static void main(String[] args) {
        e6_7();
    }


//Exercise 1 => get random integer number from the input max length
    public static void e1 () {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        
        int[] intarr = new int[N];  

        for (int i = 0; i<intarr.length; i++){
        intarr[i] = r.nextInt(N+1);
        }
        
        for (int i=0; i<intarr.length; i++){
        System.out.printf("Index[%d] : %d\n", i, intarr[i]);
        }

        sc.close();
    }



// Exercise 2 => get the index of the min value (special case)
    public static void e2() {
        Scanner sc = new Scanner(System.in);
    
        //Enter ARRAY LENGTH
        System.out.print("Enter the size of your integer array: ");
        int n = sc.nextInt();

        //Enter ARRAY VALUE
        System.out.println("Enter the value for each index in the integer array: ");
        int[] numbers = new int[n];
        
        for (int index=0; index<numbers.length; index++){
        numbers[index] = sc.nextInt();
        }

        for (int i=0; i<numbers.length; i++) {
        System.out.printf("index [%d] : %d\n",i,numbers[i]);
        }

        
        System.out.println("The index of smallest value: " + getIndexMin(numbers));
        sc.close();
    }


//get min index
    public static int getIndexMin(int[] numbers){
        int min = numbers[0];
        int indexmin = -1;
        for (int i=0; i<numbers.length; i++){
        if (numbers[i] <= min) {
            min = numbers[i];
            indexmin = i;
        }
        }
        return indexmin;
    }



//Exercise 3 => get index of the min value start "from" => ex2 = 0 is the special case
    public static void e3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index where you want to start from index: ");
        int from = sc.nextInt();
        System.out.print("How is the size of your array: ");
        int n = sc.nextInt();
        System.out.println("Enter the value for each index: ");
        int[] numbers = new int[n];

        for (int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("The result:");
        for (int i=0; i<numbers.length; i++){
            System.out.printf("Index [%d] : %d\n",i,numbers[i]);
        }

        System.out.printf("The index of smallest value: %d\n",getIndexMinFrom(numbers, from));
        sc.close();
    }



//get index of min from ...
    public static int getIndexMinFrom(int[] numbers, int from){
        int min = numbers[from];
        int indexmin = -1;

        for (int i=from; i<numbers.length; i++){
            if (numbers[i] <= min) {
            min = numbers[i];
            indexmin = i;
            }
        }
        return indexmin;
    }
    


//Swapping the min value 
    public static void e4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Where you want to start on the array: ");
        int from = sc.nextInt();

        System.out.print("How is you array size: ");
        int n = sc.nextInt();

        System.out.println("Enter the value for each element: ");
        int[] numbers = new int[n];
        for(int i=0; i < numbers.length; i++) {
        numbers[i] = sc.nextInt();
        }
        System.out.println("The Results: ");
        for (int i=0; i < numbers.length; i++){
        System.out.printf("Index [%d] : %d\n", i, numbers[i]);
        }
        
        //unorder
        System.out.println("The Original Order: ");
        for (int i=0; i < numbers.length; i++){
        System.out.printf("Index [%d] : %d\n", i, numbers[i]);
        }

        //Updated numbers
        int[] updated_numbers = exchangeMinFrom(numbers, from);
        System.out.println("The Updated Order: ");
        for (int i=0; i < updated_numbers.length; i++){
        System.out.printf("Index [%d] : %d\n", i, updated_numbers[i]);
        }
        sc.close();
    }



//swapping value to the first index
    public static int[] exchangeMinFrom(int[] numbers, int from){
        int min_index = getIndexMinFrom(numbers, from);
        int temp;
        temp = numbers[min_index];
        numbers[min_index] = numbers[from];
        numbers[from] = temp;
        return numbers;
    }



// Exercise 5 => sorting value
    public static void e5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Where you want to start on the array: ");
        int from = sc.nextInt();
    
        System.out.println("How is the size of you array: ");
        int n = sc.nextInt();
    
        System.out.println("Enter the value for each element: ");
        int[] numbers = new int[n];
    
        for (int i=0; i<numbers.length; i++){
          numbers[i] = sc.nextInt(); 
        }
    
        System.out.println("The result:");
        for (int i=0; i<numbers.length; i++){
            System.out.printf("Index [%d] : %d\n",i,numbers[i]);
        }
    
      
        //before sorted
        System.out.println("The Unsorted Numbers:");
        for (int i=0; i<numbers.length; i++){
          System.out.printf("Index [%d] : %d\n",i,numbers[i]);
        }
    
        //after sorted
        int[] sorted_numbers = sortBySelection(numbers, from);
        System.out.println("The Sorted Numbers:");
        for (int i=0; i<sorted_numbers.length; i++){
          System.out.printf("Index [%d] : %d\n",i,sorted_numbers[i]);
        }
    
        sc.close();
    }
      


//sort min to max 
    public static int[] sortBySelection(int[] numbers,int from){
        for(int i=from; i<numbers.length; i++){
          exchangeMinFrom(numbers, i);
        }
        return numbers;
    }
      


//caro 3*3
    //DISPLAY THE GAME
    public static void displayGame(char[][] board) {
        for(char[] row : board) {
            System.out.print("|");
            for (char cell : row){
                System.out.printf(" %c |",cell);
                
            }
            System.out.print("\n");
            System.out.print("\n");
        }
        System.out.println("");
    }

    //END THE GAME
    public static char endGame(char[][] board) {

        // ASSIGNING PLAYER TO X AND O
        char[] players_list = {'X', 'O'};
        for (char player : players_list){
            //horizon and vertical checked
            for (int row = 0; row < board[0].length; row++) {
                if (board[row][0] == player &&
                    board[row][1] == player &&
                    board[row][2] == player) {
                    return player;
                }
            }

            for (int col = 0; col < board[0].length; col++) {
                if (board[0][col] == player &&
                    board[1][col] == player &&
                    board[2][col] == player) {
                    return player;
                }
            }

            //diagonal checked
            if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) {
                return player;
            }

            if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) {
                return player;
            }


            //check if there is at least 1 empty cell(the dot means empty), the game can continue

            for (int row=0; row < board[0].length; row++) {
                for (int col=0; col < board.length; col++){
                    if(board[row][col]==' '){
                        return ' ';
                    }
                }
            }
        }
        return 'C';
    }


    public static void e6_7() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of your caro board: ");
        System.out.print("Row = ");
        int row = s.nextInt();
        System.out.print("Column = ");
        int col = s.nextInt();
        System.out.println("");

        char[][] board = new char[row][col];
        for (row=0; row<board[0].length; row++) {
            
            for(col=0; col<board.length; col++) {
                board[row][col] = ' ';
            }
        }
        
        displayGame(board);
        
        char[] players_list = {'O','X'};
        int playerturn = (int) Math.random()*players_list.length;
        char fin = endGame(board);
        while (fin == ' '){
            System.out.println("Current game: ");
            displayGame(board);
            playerturn = (playerturn + 1) % players_list.length;
            //announcement 
            System.out.printf("Current player is: %c\n", players_list[playerturn]);
            //accept position that play want to choose
            System.out.print("Choose the number from 0-2 for a row:");
            row = s.nextInt();
            System.out.print("Choose the number from 0-2 for a column:");
            col = s.nextInt();
            board[row][col] = players_list[playerturn];


            //check fininsh
            fin = endGame(board);
        }

        if (fin == 'C') {
            System.out.println("Game is tie: ");
        } else {
            System.out.println(players_list[playerturn] + " wins the game!");
        }

        s.close();
    }

}
