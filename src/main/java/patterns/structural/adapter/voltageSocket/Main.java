package patterns.structural.adapter.adapter.voltageSocket;

public class Main {
    public static void main(String[] args) {
        ChargingStation chargingStation = new ChargingStation();
        EuroPhone euroPhone = new EuroPhone();
        ChinaPhone chinaPhone = new ChinaPhone();
        ChinaToEuroAdapter chinaToEuroAdapter = new ChinaToEuroAdapter(chinaPhone);
        chargingStation.charge(euroPhone);
        chargingStation.charge(chinaToEuroAdapter);

    }
}
