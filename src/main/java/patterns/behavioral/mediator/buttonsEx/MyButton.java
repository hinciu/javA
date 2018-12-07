package patterns.behavioral.mediator.buttonsEx;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyButton extends JButton implements Component {

    ButtonMediator mediator;

    String name;

    public MyButton(ButtonMediator mediator,String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void active() {
        this.setText("ACTIVE");
    }

    @Override
    public void inactive() {
        this.setText("      ");
    }

    @Override
    public void changeStatus() {
        mediator.changeButtonStatus(this);
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.changeButtonStatus(this);
    }
}
