import java.io.*;

class Singleton {
    // Static instance variable
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    // Static method to get the instance
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

    public void doSomething() {
        System.out.println("Something is Done.");
    }
}

class GFG {
    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
    }
}
