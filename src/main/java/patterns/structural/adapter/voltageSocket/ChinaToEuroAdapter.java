package patterns.structural.adapter.adapter.voltageSocket;

public class ChinaToEuroAdapter implements EuroSocket {

    ChinaPhone chinaPhone;

    public ChinaToEuroAdapter(ChinaPhone chinaPhone) {
        this.chinaPhone = chinaPhone;
    }

    @Override
    public void connect() {
        System.out.println("china to euro");
    }

    @Override
    public void charge() {
        chinaPhone.charge();
    }
}
