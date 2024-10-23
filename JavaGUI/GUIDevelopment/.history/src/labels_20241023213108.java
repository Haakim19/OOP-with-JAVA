import java.awt.*;

import javax.swing.*;

public class labels{
    public static void main(String[] args) {
        //creating a image instence
        ImageIcon image = new ImageIcon("harryPoter.png");
        JLabel lable = new JLabel();//create a label
        
        lable.setText("Hello World");//add text to the label
        lable.setIcon(image);//add image to the label
        lable.setHorizontalTextPosition(JLabel.CENTER);//set the text LEFT, CENTER, RIGHT of the imageicon
        lable.setVerticalTextPosition(JLabel.TOP);//set the text TOP, CENTER, BOTTOM of the imageicon
        lable.setForeground(new Color(0x00FF00));//set the color of the text
        lable.setFont(new Font("MV Boli", Font.PLAIN, 20));//set the font of the text
        lable.setIconTextGap(10);//set the gap of the text to the image
        
        
        
        
        
        JFrame frame =new JFrame();//create a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit the frame when close
        frame.setSize(500,500);//set the size of the frame
        frame.setVisible(true);//make the frame visible
        frame.add(lable);
    }
}