package patterns.behavioral.mediator.chatEx;

public interface ChatMediator {
    public void  addUser(User user);
    public void  sendMessage(String msg ,User u);
}
