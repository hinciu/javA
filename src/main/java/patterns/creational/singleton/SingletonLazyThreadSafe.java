package patterns.creational.singleton;

public class SingletonLazyThreadSafe {

    private static SingletonLazyThreadSafe instance;

    private SingletonLazyThreadSafe() {
    }

    public static synchronized SingletonLazyThreadSafe getInstance() {
        if (instance == null){
            instance = new SingletonLazyThreadSafe();
        }
        return instance;
    }

    public static SingletonLazyThreadSafe getInstance2() {
        if (instance == null){
            synchronized (SingletonLazyThreadSafe.class){
                if (instance==null){
                    instance = new SingletonLazyThreadSafe();
                }
            }
        }
        return instance;
    }


}
