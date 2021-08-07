import java.io.*;
public class Exe2 {
    public static void main(String[] args) throws IOException{
        FileReader reader = new FileReader("users.txt");
        BufferedReader reader1 = new BufferedReader(reader);

        String line;
        line = reader1.readLine();

        while(line != null) {
            String[] result = line.split("@");
            System.out.println("My name is " + result[0] + ". I live in " + result[1] + ". I'm " + result[2]);
            line = reader1.readLine();
        }
    }
}
