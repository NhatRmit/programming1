import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Lecture {
    public static void main(String[] args) throws ParseException {
        Course c1 = new Course();
        Course c2 = new Course("COSC2030", "Web Programming", 3);

        c1.setCode("COSC2081");
        c1.setName("Programming 1");
        c1.setCredits(3);

        System.out.printf("Course object 1: %s - %s - %d\n", c1.getCode(), c1.getName(), c1.getCredits());

        System.out.printf("Course object 2: %s - %s - %d\n", c2.getCode(), c2.getName(), c2.getCredits());

        Student s = new Student();
        s.name = "Nhat";
        s.course_list = new Course[2];
        s.course_list[0] = c1;
        s.course_list[1] = c2;

        for (Course course : s.course_list){
            System.out.println(course);
        }

        Date myDate = new Date();
        DateFormat df = DateFormat.getDateInstance();
        String str =df.format(myDate);
        myDate = df.parse(str);
        System.out.println(myDate); // not including TIME
    }
}

class Student {
    String name;
    Course[] course_list;
}

class Course {
    private String code;                   //Property     
    private String name;
    private int credits;


    public Course() {} //Default constructor wo param
    public Course(String code, String name, int credits) { //constructor wi 3 params
        this.code = code;           //this is the return for data field of class
        this.name = name;           //this is the return for data field of class
        this.credits = credits;     //this is the return for data field of class
    }

    //Mutator = Set Method to access private
    public void setCode(String code) {this.code = code;}
    public void setName(String name) {this.name = name;}
    public void setCredits(int credits) {
        if(credits <= 0){
            return;
        }
        this.credits = credits;
    }

    //Accessor = Get Method to access private
    public String getCode() {return code;}
    public String getName() {return name;}
    public int getCredits() {return credits;}

    //functions
    public String toString() {
        return code + " " + name + " " + credits; 
    }
}