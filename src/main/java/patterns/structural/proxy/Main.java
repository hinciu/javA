package patterns.structural.proxy;
//         Proxy pattern common uses are to control access or to provide a wrapper
//        implementation for better performance.
public class Main {
    public static void main(String[] args) {
        DbAccesser dbAccesser = new DbConnectorProxy();
        dbAccesser.connectToDb();
    }
}
