import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;



public class Lecture {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Writing file
        Student s1 = new Student("Nhat", "s3765963");
        PrintWriter print = new PrintWriter("src/student.txt");
        print.printf("%s\t%s", s1.name, s1.id);
        print.close();

        //Reading file
        Scanner s = new Scanner(new File("src/student.txt"));
        while(s.hasNext()){
            String line = s.nextLine();
            String[] tokens = line.split("\t");
            Student student = new Student(tokens[0], tokens[1]);
            student.display();
        }

        //create cake object and save to a file
        FileOutputStream of = new FileOutputStream("cakes.obj");
        ObjectOutputStream cakeOut = new ObjectOutputStream(of);
        Cake c  = new Cake("Pie", 20.5);
        cakeOut.writeObject(c);


        //get Cake from file
        FileInputStream of1 = new FileInputStream("cakes.obj");
        ObjectInputStream cakeIn = new ObjectInputStream(of1);
        Cake c1 = (Cake)cakeIn.readObject();
        System.out.println(c1);


        //Get the file from directory
        File current = new File(".");
        display(current, 0);
        
    }

    static void display(File current, int level){
        File[] files = current.listFiles();
        for(File f : files){
            int temp = level;
            String space = "";
            while(temp>0){
                space += " ";
                temp--;
            }
            System.out.println(space + f.getName());
            if(f.isDirectory()) {
                display(f, level+1);
            }
        }
    }
}

class Student{
    public String name;
    public String id;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.printf("Student %s %s\n", name, id);
    }
}

class Cake implements Serializable {
    public String name;
    private double price;

    public Cake(String name, double price){
        this.name = name;
        this.price = price;
    }

    //show every time we use print for an obj
    public String toString() {
        return name + ": " + price;
    }
}


