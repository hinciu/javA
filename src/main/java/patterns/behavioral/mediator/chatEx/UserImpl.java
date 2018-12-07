package patterns.behavioral.mediator.chatEx;

public class UserImpl extends User {

    public UserImpl(String name, ChatMediator chatMediator) {
        super(chatMediator, name);
    }

    @Override
    public void send(String msg) {
        chatMediator.sendMessage(msg, this);
    }

    @Override
    public void recieve(String msg) {
        System.out.println(name + ":" + msg);
    }
}
