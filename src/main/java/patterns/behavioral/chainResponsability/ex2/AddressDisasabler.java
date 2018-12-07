package patterns.behavioral.chainResponsability.ex2;

public interface AddressDisasabler {
    public void rest(String address);
    public void setNext(AddressDisasabler addressDisasabler);
    public String getResult();
}
