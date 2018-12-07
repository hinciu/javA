package patterns.behavioral.chainResponsability;

public abstract class Notifier {

    private int priority;
    private Notifier next;

    public Notifier(int priority) {
        this.priority = priority;
    }


    public void setNext(Notifier next) {
        this.next = next;
    }

    public void notify(String msg, int level) {
        if (level >= priority) {
            write(msg);
        }
        if (next != null) {
            next.notify(msg, level);
        }
    }

    protected abstract void write(String msg);
}
