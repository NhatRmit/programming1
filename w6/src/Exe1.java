import java.io.*;
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) throws IOException {
        String name, address;
        int age;

        Scanner s = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = s.next();
        
        System.out.print("Where do you live? ");
        address = s.next();
        
        System.out.print("How old are you? ");
        age =  Integer.parseInt(s.nextInt());
        
        
        FileWriter out = new FileWriter("users.txt", true);//true to append
        out.write(name + "@" + address + "@" + age + "\n");
        out.flush(); //add into obj
    }
}
