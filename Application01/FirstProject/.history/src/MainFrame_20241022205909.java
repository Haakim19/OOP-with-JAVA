import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);
    JTextField txtFirstName,txtLastName,txtEmail; ;
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
        
        JLabel lbEmail = new JLabel("Email");
        lbEmail.setFont(mainFont);

        txtEmail = new JTextField();
        txtEmail.setFont(mainFont);
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6, 1));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(txtFirstName);
        formPanel.add(lbLastName);
        formPanel.add(txtLastName);
        formPanel.add(lbEmail);
        formPanel.add(txtEmail);

        //************ Greeting Panel ****************//
        greetingLabel = new JLabel();
        greetingLabel.setFont(mainFont);

        //************ Button Panel ****************//
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);    
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                greetingLabel.setText("Hello, " + firstName + " " + lastName + "!");
            }
        });
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                txtFirstName.setText("");
                txtLastName.setText("");
                greetingLabel.setText("");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.setOpaque(false);
        buttonPanel.add(btnOK);
        buttonPanel.add(btnClear);

        JPanel mainJPanel = new JPanel();
        mainJPanel.setLayout(new BorderLayout());
        mainJPanel.setBackground(new Color(100, 120, 155));
        mainJPanel.add(formPanel, BorderLayout.NORTH);
        mainJPanel.add(greetingLabel, BorderLayout.CENTER);
        mainJPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        add (mainJPanel);

        this.setTitle("Hello, World!");
        this.setSize(500, 500);
        this.setMaximumSize(new Dimension(400, 400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.init();
    }
}