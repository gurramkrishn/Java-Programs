package threads;

public class Singleton
{
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
    }

    // Lazy initialization with double-checked locking for thread safety
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

    // Example method to test singleton behavior
    public String doSomething() {
        return "Singleton instance is doing something!";
    }
}
