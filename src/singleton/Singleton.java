package singleton;

public class Singleton implements Cloneable{
    private static volatile Singleton instance = null;
    int counter = 0;

    private Singleton() {
        counter++;
        System.out.println("Constructor called: " + counter + " time(s)");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static String doSomething() {
        return "Hi Baby";
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("HashCodes: " + s1.hashCode() + ", " + s2.hashCode());
        System.out.println("Same instance? " + (s1 == s2));

    }

    class test{

    }
}
