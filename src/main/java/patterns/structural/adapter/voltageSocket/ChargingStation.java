package patterns.structural.adapter.adapter.voltageSocket;

public class ChargingStation {


    public void charge(EuroSocket euroSocket){
        euroSocket.connect();
        euroSocket.charge();
    }
}
