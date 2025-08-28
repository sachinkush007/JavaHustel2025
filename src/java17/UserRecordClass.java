package java17;

public record UserRecordClass(String name,int age){
}

// This is equivalent to:

final class User{
    private final String name;
    private final int age;

    User(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String name(){
        return name;
    }
    public int age(){
        return age;
    }
}
