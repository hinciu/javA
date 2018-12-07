package patterns.behavioral.chainResponsability.ex2;

public class Main {
    public static void main(String[] args) {
        String fullAddress = "str.Moldova house.5 ap.25";
        AddressDisasabler streetExtractor = new StreetExtractor();
        AddressDisasabler houseExtractor = new HouseExtractor();
        streetExtractor.setNext(houseExtractor);

        streetExtractor.rest(fullAddress);
    }
}
