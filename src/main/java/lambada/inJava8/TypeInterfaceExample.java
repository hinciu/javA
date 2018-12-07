package lambada.inJava8;

public class TypeInterfaceExample {
    public static void main(String[] args) {
        //StringLengthLambada myLambada = (String a) -> a.length();
        StringLengthLambada myLambada = a -> a.length();

        System.out.println(printLength(a -> a.length(), "Hello"));

    }

    public static int  printLength(StringLengthLambada stringLengthLambada, String str){
        return  stringLengthLambada.getLength(str);
    }

    interface StringLengthLambada {
        int getLength(String s);
    }
}
