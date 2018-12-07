package lambada.inJava8;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myTheread = new Thread(() -> System.out.println("hello"));
        myTheread.run();
    }


}
