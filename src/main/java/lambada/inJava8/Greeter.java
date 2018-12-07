package lambada.inJava8;

public class Greeter {
    public void greet(GreetingInterface greetingInterface) {
        greetingInterface.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        GreetingInterface helloWorldGreeter = new HelloWorldGreeter();
        GreetingInterface myLambada = () -> System.out.println("HelloWorld");

        GreetingInterface innerClassGreeting = new GreetingInterface() {
            @Override
            public void perform() {
                System.out.println("Hallo Vorld");
            }
        };

        helloWorldGreeter.perform();
        myLambada.perform();
        innerClassGreeting.perform();



        greeter.greet(myLambada);  // passing behaviour to the greet method


    }

    interface MyLambada {
        void foo();
    }
}
