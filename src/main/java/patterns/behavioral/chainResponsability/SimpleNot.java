package patterns.behavioral.chainResponsability;

public class SimpleNot extends Notifier {
    public SimpleNot(int priority) {
        super(priority);
    }


    @Override
    protected void write(String msg) {
        System.out.println("simple" + " " + msg);
    }
}
