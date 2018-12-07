package patterns.behavioral.mediator.chatEx;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl("Pankaj", mediator);
        User user2 = new UserImpl("Lisa", mediator);
        User user3 = new UserImpl("Saurabh", mediator);
        User user4 = new UserImpl("David", mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("hi alll");
    }
}
