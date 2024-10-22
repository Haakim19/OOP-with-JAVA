import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
    public void init(){
        JPanel mainpJPanel = new JPanel();
        mainpJPanel.setLayout();
        this.setTitle("Hello, World!");
        this.setSize(400, 400);
        this.setMaximumSize(new Dimension(400, 400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}