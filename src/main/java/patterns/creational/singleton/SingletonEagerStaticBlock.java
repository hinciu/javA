package patterns.creational.singleton;

public class SingletonEagerStaticBlock {
    private static SingletonEagerStaticBlock instance;

    private SingletonEagerStaticBlock() {
    }

    static {
        instance = new SingletonEagerStaticBlock();
    }

    public static SingletonEagerStaticBlock getInstance() {
        return instance;
    }
}
