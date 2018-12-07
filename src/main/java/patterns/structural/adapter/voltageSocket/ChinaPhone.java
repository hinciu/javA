package patterns.structural.adapter.adapter.voltageSocket;

public class ChinaPhone implements ChinaSocket {
    @Override
    public void connect() {
        System.out.println("china to china");
    }

    @Override
    public void charge() {
        System.out.println("charging");
    }
}
