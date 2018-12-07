package patterns.creational.singleton;

public class SigletonLazy {

    private static SigletonLazy instance;

    private SigletonLazy() {
    }

    public static SigletonLazy getInstance() {
        if (instance == null){
         instance = new SigletonLazy();
        }
        return instance;
    }
}
