import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);
    JTextField 
    public void init(){
        //************ Form Panel ****************//
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        JPanel mainpJPanel = new JPanel();
        mainpJPanel.setLayout(new BorderLayout());
        mainpJPanel.setBackground(new Color(100, 120, 255));
        
        this.setTitle("Hello, World!");
        this.setSize(400, 400);
        this.setMaximumSize(new Dimension(400, 400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}