package uikit;
import javax.swing.*;//impost the swing package
import java.awt.*;//import the awt package

public class AppUI extends JFrame{
    private JLabel lblUserName,lblPassword;
    private JButton btnLogin,btnReset;
    private JTextField txtUserName,txtPassword;
    public AppUI(){
                //!creating components
        //?JLabel is a component that displays text or an image
        lblUserName = new JLabel("User Name");
        lblPassword = new JLabel("Password");

        //?JButton is a component that triggers an action when clicked
        btnLogin = new JButton("Login");
        
        btnReset = new JButton("Reset");

        //?JTextField is a component that allows the editing of a single line of text
        txtUserName = new JTextField(10);
        txtPassword = new JTextField(10);
        Container mainScreen = this.getContentPane();

        //!Creating a screen layout
        //?the defoult layout is CardLayout- its stacks the components on top of each other
        mainScreen.setLayout(new GridLayout(3, 2));
        //Adding components to the screen
        mainScreen.add(lblUserName);
        mainScreen.add(txtUserName);
        mainScreen.add(lblPassword);
        mainScreen.add(txtPassword);
        mainScreen.add(btnLogin);
        mainScreen.add(btnReset);

        setSize(400,400);//set the size of the screen
        setVisible(true);//set secreen to be visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set the default close operation to exit the screen
        //(without this the screen will not close)
        
    }
    public static void main(String[] args) {
        AppUI appui = new AppUI();
        
    }
}
