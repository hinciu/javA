package patterns.structural.proxy;

public class DbConnectorProxy implements DbAccesser {

    private DbConnector dbConnector;

    public DbConnectorProxy() {
        this.dbConnector = new DbConnector();
    }

    @Override
    public void connectToDb() {
        System.out.println("Additional verification before run");
        dbConnector.connectToDb();
    }
}
