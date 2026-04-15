
class Person {

    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void showRole() {
        System.out.println("I am a person in the school system.");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Teacher extends Person {

    String subject;
    double salary;

    
    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    
    void showRole() {
        System.out.println("I am a Teacher. I teach students.");
    }

    void displayTeacherInfo() {
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {

    int rollNumber;
    String course;

    // Constructor
    Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }


    void showRole() {
        System.out.println("I am a Student. I study subjects.");
    }

    void displayStudentInfo() {
        displayInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class SchoolManagementSystem {

    public static void main(String[] args) {

      Teacher teacher = new Teacher("Mr Sharma",40,"Mathematics",50000);
      Student student = new Student ("Rahul",20,101,"Computer Science");
   }
}