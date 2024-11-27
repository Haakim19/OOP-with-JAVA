package uikit;
import javax.swing.JFrame;
public class AppUI extends JFrame{
    
    public AppUI(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        AppUI appui = new AppUI();
    }
}
