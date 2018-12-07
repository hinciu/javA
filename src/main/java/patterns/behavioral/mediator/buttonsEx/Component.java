package patterns.behavioral.mediator.buttonsEx;

public interface Component {
    public String name();
    public void active();
    public void inactive();
    public void changeStatus();
}
