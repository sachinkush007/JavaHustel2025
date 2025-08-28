package object;

public class Student implements Cloneable {
    public int rollNum;
    Address address; //Where shallow copy failed for the object/reference type variable

    //Solution:: Deep Copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student= (Student) super.clone();
        student.address= (Address) address.clone(); //deep copy
        return student;
    }
}
