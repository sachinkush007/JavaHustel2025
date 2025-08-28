package object.cloning;

import object.Student;

public class ReferenceCloning {
    public static void main(String[] args) {
        Student student=new Student();
        student.rollNum=10;
        Student student1=student; // Reference copy

        System.out.println(student.rollNum);
        System.out.println(student1.rollNum);

        System.out.println("**********************************************");
        System.out.println("If we change the value of one reference its impact all the references");
        student1.rollNum=20;
        System.out.println(student1.rollNum);
        System.out.println(student.rollNum);
    }
}
