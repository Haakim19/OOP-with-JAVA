import javax.swing.*;

public class labels{
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("harryPoter.png");
        JLabel lable = new JLabel();
        lable.setText("Hello World");
        
        
        
        
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(lable);
    }
}