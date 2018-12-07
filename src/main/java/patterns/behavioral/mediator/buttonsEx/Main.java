package patterns.behavioral.mediator.buttonsEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
//Mediator design pattern is very helpful in an enterprise application where
//        multiple objects are interacting with each other. If the objects interact with
//        each other directly, the system components are tightly-coupled with each
//        other that makes maintainability cost higher and not flexible to extend
//        easily. Mediator pattern focuses on provide a mediator between objects for
//communication and help in implementing lose-coupling between objects.
//Mediator pattern is useful when the communication logic between
//        objects is complex, we can have a central point of communication that
//        takes care of communication logic.

//The system objects that communicate each other are called Colleagues. - Component and My Component
public class Main {
    public static void main(String[] args) {
        ConcreteMediator buttonMediator = new ConcreteMediator();
        buttonMediator.createGui();


//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                button1.changeStatus();
//            }
//        });
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                button2.changeStatus();
//            }
//        });
//        button3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                button3.changeStatus();
//            }
//        });


    }
}
