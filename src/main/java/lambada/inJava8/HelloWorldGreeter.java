package lambada.inJava8;

public class HelloWorldGreeter implements GreetingInterface {
    @Override
    public void perform() {
        System.out.println("Hello world");
    }
}
