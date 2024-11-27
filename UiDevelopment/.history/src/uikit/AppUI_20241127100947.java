package uikit;
import javax.swing.*;
import java.awt.*;

public class AppUI extends JFrame{
    private JLabel lblUserName,lblPassword;
    private JButton btnLogin,btnReset;
    private JTextField txtUserName,txtPassword;
    Frame frame = new Frame();
    public AppUI(){
        
        
        lblUserName = new JLabel("User Name");
        lblPassword = new JLabel("Password");
        
        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");

        txtUserName = new JTextField(10);
        txtPassword = new JTextField(10);
        Container mainScreen = this.getContentPane();
        mainScreen.setLayout(new FlowLayout());
        mainScreen.add(lblUserName);
        mainScreen.add(txtUserName);
        mainScreen.add(lblPassword);
        mainScreen.add(txtPassword);
        mainScreen.add(btnLogin);
        mainScreen.add(btnReset);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        AppUI appui = new AppUI();
        
    }
}
