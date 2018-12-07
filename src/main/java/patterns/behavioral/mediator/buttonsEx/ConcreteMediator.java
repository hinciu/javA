package patterns.behavioral.mediator.buttonsEx;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements ButtonMediator {

    MyButton button1 = new MyButton(this,"button 1");
    MyButton button2 = new MyButton(this,"button 2");
    MyButton button3 = new MyButton(this,"button 3");
    JLabel jLabel = new JLabel();



    public void createGui(){
        JFrame f = new JFrame("Text Field Examples");
        f.getContentPane().setLayout(new FlowLayout());
        f.getContentPane().add(button3);
        f.getContentPane().add(button2);
        f.getContentPane().add(button1);
        f.getContentPane().add(jLabel);
        f.pack();
        f.setVisible(true);
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
    }

    private List<Component> buttons = new ArrayList<>();

    @Override
    public void changeButtonStatus(Component button) {
        button.active();
        for (Component b : buttons) {
            if (b!= button){
                b.inactive();
                jLabel.setText(button.name() + "changed status");
            }
        }
    }

}
