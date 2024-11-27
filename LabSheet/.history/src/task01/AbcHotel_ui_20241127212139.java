package task01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class AbcHotel_ui  extends JFrame{
    private JLabel lblRoomType,lblGuestType,lblNumbberFoDats;
    private JButton btnSubmit;
    private JTextField txtRoomType,txtGuestType,txtNumberFoDays;

    public AbcHotel_ui(){
        setTitle("AbcHotel");
        JLabel headline = new JLabel("Welcome",JLabel.CENTER);
        headline.setFont(new Font("monospace", Font.BOLD,30));
        headline.setLayout(new BorderLayout());
        add(headline,BorderLayout.NORTH);
        //lables
        lblRoomType = new JLabel("RoomType");
        lblGuestType = new JLabel("Guest Type");
        lblNumbberFoDats = new JLabel("Number fo Days");
        //button
        btnSubmit = new JButton("Submit");

        //text field
        txtRoomType = new JTextField("Room Type");
        txtGuestType = new JTextField("Guest Type");
        txtNumberFoDays = new JTextField("Number of Days");

        //creating the container
        Container mainScreen = this.getContentPane();
        mainScreen.setLayout(new GridLayout());
        mainScreen.add(lblRoomType);
        mainScreen.add(txtRoomType);
        mainScreen.add(lblGuestType);
        mainScreen.add(txtGuestType);
        mainScreen.add(lblNumbberFoDats);
        mainScreen.add(txtNumberFoDays);
        mainScreen.add(btnSubmit);
        setSize(320,390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class bill extends JFrame{

}