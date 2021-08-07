import java.io.*;
import java.util.*;
public class Exe3 {
    public static void studentObjInput() {
        FileOutputStream file = new FileOutputStream("students.obj");
        ObjectOutputStream object = new ObjectOutputStream(file);
        
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = s.nextLine();
        System.out.print("What is your major? ");
        String major = s.nextLine();
        System.out.print("How is your GPA? ");
        double GPA = s.nextDouble();
        s.nextLine();

        object.writeObject(new Student(name, major, GPA));

    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        studentObjInput();
    }
}

class Student implements Serializable { //write AN OBJECT, not attribute
    String name;
    String major;
    double GPA;

    Student(String name, String major, double GPA) {
        this.name = name;
        this.major = major;
        this.GPA = GPA;
    }

    public String toString () {
        return String.format("Name: %s\tMajor: %s\tGPA: %s", name, major, GPA);
    }
}
