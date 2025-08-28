package object;

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create and initialize Student and Address objects
        Address address = new Address();
        address.addressId = 1;

        Student student = new Student();
        student.rollNum = 101;
        student.address = address;

        // Perform deep copy
        Student clonedStudent = (Student) student.clone();

        // Test deep copy
        System.out.println("Original Address ID: " + student.address.addressId); // 1
        System.out.println("Cloned Address ID: " + clonedStudent.address.addressId); // 1

        // Modify cloned object's address ID
        clonedStudent.address.addressId = 99;

        // Check if original object is affected
        System.out.println("Original Address ID after modification: " + student.address.addressId); // 1
        System.out.println("Cloned Address ID after modification: " + clonedStudent.address.addressId); // 99
    }
}
