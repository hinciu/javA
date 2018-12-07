package patterns.behavioral.chainResponsability;

public class Urgent extends Notifier {
    public Urgent(int priority) {
        super(priority);
    }



    @Override
    protected void write(String msg) {
        System.out.println("Urgent" + " "+ msg);
    }
}
