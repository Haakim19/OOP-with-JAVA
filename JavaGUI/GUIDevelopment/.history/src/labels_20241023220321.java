import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class labels{
    public static void main(String[] args) {
        //creating a image instence
        
        ImageIcon image = new ImageIcon("harryPoter.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        JLabel label = new JLabel();//create a label
        label.setText("Hello World");//add text to the label
        label.setIcon(image);//add image to the label
        label.setHorizontalTextPosition(JLabel.CENTER);//set the text LEFT, CENTER, RIGHT of the imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set the text TOP, CENTER, BOTTOM of the imageicon
        label.setForeground(new Color(0x00FF00));//set the color of the text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));//set the font of the text
        label.setIconTextGap(20);//set the gap of the text to the image
        label.setBackground(Color.red);//set the background color
        label.setOpaque(true);//display the background color
        label.setBorder(border);//set the border of the label
        label.setVerticalAlignment(JLabel.CENTER);//set the vertical position of the label
        label.setHorizontalAlignment(JLabel.CENTER);//set the horizontal position of the label  
        // label.setBounds(2,2,400,400);//set the position and size of the label

        JFrame frame =new JFrame();//create a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit the frame when close
        frame.setSize(500,500);//set the size of the frame
        // frame.setLayout(null);//set the layout of the frame
        frame.setVisible(true);//make the frame visible
        frame.add(label);
        frame.pack();//set the size of the frame according to the components
    }
}