package patterns.behavioral.chainResponsability.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HouseExtractor implements AddressDisasabler {
    AddressDisasabler addressDisasabler;

    private String streetRegex = "house.(\\d+)";


    @Override
    public void rest(String address) {
        Pattern p = Pattern.compile(streetRegex);
        Matcher matcher = p.matcher(address);
        if (matcher.find()) {
            String res = matcher.group();
            System.out.println(res);
            if (addressDisasabler!=null){
                addressDisasabler.rest(address);
            }


        }


    }

    @Override
    public void setNext(AddressDisasabler addressDisasabler) {
        this.addressDisasabler = addressDisasabler;
    }

    @Override
    public String getResult() {
        return "";
    }
}
