package java17;

public class FetchUserData {
    public static void main(String[] args) {
        UserRecordClass userRecordClass=new UserRecordClass("sachin",10);
        System.out.println("Name: "+userRecordClass.name());
        System.out.println("Age: "+userRecordClass.age());
    }
}
