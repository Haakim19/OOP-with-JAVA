import javax.swing.*;
public class LearnFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit when close
        frame.setResizable(false);//cannot resize
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ImageIcone image = new ImageIcon("icon.png");
    }
}
