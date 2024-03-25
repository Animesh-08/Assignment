import java.util.*;

class InvalidAgeException extends Exception {
    public String toString() {
        return "Invalid Age Exception";
    }
}

class InvalidNameException extends Exception {
    public String toString() {
        return "Invalid Name Exception";
    }
}

class Student {
    static int rollno, age;
    static String name, course;

    Student(int rn, String sname, int sage, String scourse) {
        this.rollno = rn;
        this.name = sname;
        this.age = sage;
        this.course = scourse;
    }

    static void check() throws InvalidAgeException, InvalidNameException {
        if (age > 21 || age < 15) {
            throw new InvalidAgeException();
        } else {
            throw new InvalidNameException();
        } 
    }
    public void display()
    {
    System.out.println("Name: "+name);
    System.out.println("Roll No: "+rollno);
    System.out.println("Course: "+course);
    System.out.println("Age: "+age);
    }
}

class AgeExceptions {
    public static void main(String args[]) {
        int rn, sage;
        String sname, scourse;
        try {
            Scanner sc = new Scanner(System.in);
            rn = sc.nextInt();
            sage = sc.nextInt();
            sname = sc.next();
            scourse = sc.next();
            Student s = new Student(rn, sname, sage, scourse);
            s.check();
            s.display();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
