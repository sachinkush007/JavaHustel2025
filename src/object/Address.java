package object;

public class Address implements Cloneable {
     public int addressId;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
