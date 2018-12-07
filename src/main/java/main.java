import javax.activation.DataSource;
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        List<String> myListt = Collections.synchronizedList(myList);

        Iterator<String> it = myListt.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            if(value.equals("3")) myList.remove(value);

        }


    }
}

class a {

     int var =1;

    void method() {
        System.out.println("mA");
    }
}

class b extends a {
    int var = 2;

    void method() {
        System.out.println("bA");
    }
}
