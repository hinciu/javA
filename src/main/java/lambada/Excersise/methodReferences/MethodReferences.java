package lambada.Excersise.methodReferences;

public class MethodReferences {
    public static void main(String[] args) {
        Thread t = new Thread(MethodReferences::printMessage);
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
