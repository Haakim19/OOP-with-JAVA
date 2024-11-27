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
    public void setLayout(LayoutManager lm){
        setLayout(lm);
        lblUserName.setBounds(50,50,100,30);
        txtUserName.setBounds(150,50,100,30);
        lblPassword.setBounds(50,100,100,30);
        txtPassword.setBounds(150,100,100,30);
        btnLogin.setBounds(50,150,100,30);
        btnReset.setBounds(150,150,100,30);
        add(lblUserName);
        add(txtUserName);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(btnReset);
    }
    public static void main(String[] args) {
        AppUI appui = new AppUI();
        appui.setLayout(null);
    }
}
