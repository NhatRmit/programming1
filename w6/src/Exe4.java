import java.io.*;
import java.util.*;
public class Exe4 {
    public static void main(String[] args) {
        String filePath = "D:/Study/Java/w6";
        int space = 0;
        displayFileName(filePath, space);
    }

    public static void indentation(int space) {
        for(int i=0; i<space; i++){
            System.out.print("\s");
        }
    }

    public static void displayFileName(String dir, int space){
        File path = new File(dir);
        indentation(space);
        if(path.isDirectory()){
            System.out.println("<"+ path.getName() +">");
            File[] listDir = path.listFiles();
            if(listDir != null) {
                space += 4;
                for(File f : listDir){
                    displayFileName(f.getPath(), space);
                }
            }
        } else {
            System.out.println(path.getName());
        }
    }
}
