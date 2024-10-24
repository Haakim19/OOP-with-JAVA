package buttons;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class MyFrame extends JFrame implements AncestorListener{
    MyFrame(){

        JButton button;
        button.setBounds(200,100,100,50); // x,y,width,height



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void ancestorAdded(AncestorEvent event) {
        if (e.getSource() == button) {
            System.out.println("Button added to frame");
            
        }
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorRemoved'");
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorMoved'");
    }
}