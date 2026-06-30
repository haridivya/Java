import java.util.*;
public class Student
{
    Scanner sc=new Scanner(System.in);
    int id;
    String name;
    int age;
    String course;
    Student(){
        System.out.println("Enter Student ID:");
        id=sc.nextInt();
        System.out.println("Enter Student Name:");
        name=sc.next();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        System.out.println("Enter Course:");
        course=sc.next();
    }
    void displayDetails(){
        System.out.println("----- Student Details -----");
        System.out.println("ID          : "+id);
        System.out.println("Name        : "+name);
        System.out.println("Age         : "+age);
        System.out.println("Course      : "+course);
    }
    public static void main(String args[]){
        Student stu=new Student();
        stu.displayDetails();
    }
}
