package patterns.structural.proxy;

public class DbConnector implements DbAccesser {
    @Override
    public void connectToDb() {
        System.out.println("Connected to db");
    }
}
