import java.awt.Color;

import javax.swing.*;
public class LearnFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit when close
        // frame.setResizable(false);//cannot resize
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("icon.webp");
        frame.setIconImage(image.getImage());//Change icon of the frame
        frame.getContentPane().setBackground(new Color(0xfff0ff));//Change background color
    }
}