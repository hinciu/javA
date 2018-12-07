package patterns.behavioral.mediator.chatEx;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    List<User> allUsers = new ArrayList<>();

    @Override
    public void addUser(User user) {
        allUsers.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : allUsers){
            if (u!= user){
                u.recieve(msg);
            }
        }
    }
}
