import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);
    JTextField txtFirstName,txtLastName ;
    JLabel greetingLabel;
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
        formPanel.setLayout(new GridLayout(2, 2));
        formPanel.add(lbFirstName);
        formPanel.add(txtFirstName);
        formPanel.add(lbLastName);
        formPanel.add(txtLastName);

        //************ Greeting Panel ****************//
        greetingLabel = new JLabel();
        greetingLabel.setFont(mainFont);

        //************ Button Panel ****************//
        JButton btnGreet = new JButton("OK");
        btnGreet.setFont(mainFont);    
        JPanel mainJPanel = new JPanel();
        mainJPanel.setLayout(new BorderLayout());
        mainJPanel.setBackground(new Color(100, 120, 255));
        mainJPanel.add(formPanel, BorderLayout.NORTH);
        this.setTitle("Hello, World!");
        this.setSize(400, 400);
        this.setMaximumSize(new Dimension(400, 400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}