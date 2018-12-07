package threads;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringEscapeUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ListOff listOff = new ListOff();
//        System.out.println(listOff.hashCode());
//        for (int i = 0; i <=6; i++){
//            executorService.execute(new ListOff(4));
////            new Thread(new ListOff(4)).start();
////            System.out.println();
//        }
//        executorService.shutdown();
//        HashMap<Test, String> hashMap = new HashMap();
//        HashMap<String, String> hashMap2 = new HashMap();
//
//        hashMap.put(new Test(1), "one");
////        System.out.println();
//
//     List<Map<String,Object>> testList = new ArrayList<>();
//     HashMap<String, Object> testMap = new HashMap<>();
//     testMap.put("1",true);
//    List<List<String>> finalList =  new ArrayList<>();
//    finalList.add(new ArrayList(testMap.values()));
//
        List<String> l1 = new ArrayList<>();
//        List<String> l2 = new ArrayList<>();
//
//        l1.add("1");
//        l1.add("2");
//        l1.add("3");
//        l1.add("4");
//
//        l1.stream().filter(s-> Integer.parseInt(s) > 5).collect(Collectors.toList());

        String value1 = "1.000.500";
        String value2 = "1.000.500";
        String value3 = "1.000.500";
        value1.replaceAll(",",".");

        try {
            BigDecimal money = new BigDecimal("ddd");
        }catch (NumberFormatException ew){
            throw new NumberFormatException("sdfdsf");
        }

//
//       l1.equals(l2);
//String s = l1.toString();
//        System.out.println(s);
//        l1.retainAll(l2);


//String params = "Animal,p2,p3";
//String script= "alert(\"%s\") , alert(\"%s\"),alert(\"%s\")";
//
//String[] p = params.split(",");
//
//String result = String.format(script,p);
//        System.out.println(result);

    }


}
