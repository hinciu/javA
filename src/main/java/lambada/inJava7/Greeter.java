package lambada.inJava7;

public class Greeter {
    public void greet(GreetingInterface greetingInterface){
        greetingInterface.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
        greeter.greet(helloWorldGreeter);  // passing behaviour to the greet method
    }
}
