package patterns.structural.adapter.adapter.voltageSocket;

public class EuroPhone implements EuroSocket {
    @Override
    public void connect() {
        System.out.println("euro to euro");
    }

    @Override
    public void charge() {
        System.out.println("charging");
    }
}
