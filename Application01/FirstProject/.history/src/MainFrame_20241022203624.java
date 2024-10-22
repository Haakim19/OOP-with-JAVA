import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);
    JTextField txtFirstName,txtLastName ;
    public void init(){
        //************ Form Panel ****************//
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        txtFirstName = new JTextField();
        txtFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        txtLastName = new JTextField();
        txtLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        
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