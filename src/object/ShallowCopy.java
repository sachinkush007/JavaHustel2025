package object;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address=new Address();
        address.addressId=2;

        Student student=new Student();
        student.rollNum=10;
        student.address=address;

        Student student1=(Student)student.clone(); // Object copy

        System.out.println(student.rollNum);
        System.out.println(student1.rollNum);

        System.out.println(student.address.addressId);
        System.out.println(student1.address.addressId);

        System.out.println("**********************************************");

        student1.rollNum = 20;
        student1.address.addressId = 3;

        // Print values after modification
        System.out.println(student.rollNum); // 10
        System.out.println(student1.rollNum); // 20

        // Shallow copy failed bcs of reference variable; we are archiving deep copy
        System.out.println(student.address.addressId); // 2
        System.out.println(student1.address.addressId); // 3

    }
}
