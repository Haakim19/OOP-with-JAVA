package uikit;
import javax.swing.*;
import java.awt.*;

public class AppUI extends JFrame{
    private JLabel lblUserName,lblPassword;
    private JButton btnLogin,btnReset;
    private JTextField txtUserName,txtPassword;
    Frame frame = new Frame();
    public AppUI(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblUserName = new JLabel("User Name");
        lblPassword = new JLabel("Password");
        
        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");

        txtUserName = new JTextField(10);
        txtPassword = new JTextField(10);
        
    }
    public static void main(String[] args) {
        AppUI appui = new AppUI();
        appui.setLayout(null);
    }
}
