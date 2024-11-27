package uikit;
import javax.swing.*;

public class AppUI extends JFrame{
    private JLabel lblUserName,lblPassword;
    private JButton btnLogin,btnReset;
    private JTextField txtUserName,txtPassword;
    public AppUI(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblUserName = new JLabel("User Name");
        lblPassword = new JLabel("Password");
        
    }
    public static void main(String[] args) {
        AppUI appui = new AppUI();
    }
}
