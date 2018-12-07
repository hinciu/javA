package lambada.inJava8;

@FunctionalInterface
public interface GreetingInterface {
    public void perform();
    default public void perform2(){};

}
