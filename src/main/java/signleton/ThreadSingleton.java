package signleton;

public class ThreadSingleton {

    private static volatile ThreadSingleton instance;

    private ThreadSingleton() {

    }

    private static ThreadSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }

    public static void main(String[] args) {
        ThreadSingleton threadSingleton = ThreadSingleton.getInstance();
        threadSingleton.doSomething();
    }
}
