package task01;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class AbcHotel_ui  extends JFrame{
    private JLabel lblRoomType,lblGuestType,lblNumbberFoDats;
    private JButton btnSubmit;
    public AbcHotel_ui(){
        setTitle("Welcome");
        setTitle("AbcHotel");
        JLabel headline = new JLabel("Welcome");
        headline.setFont(new Font("monospace", Font.BOLD,30));
        //lables
        lblRoomType = new JLabel("RoomType");
        lblGuestType = new JLabel("Guest Type");
        lblNumbberFoDats = new JLabel("Number fo Days");
        //button
        btnSubmit = new JButton("Submit");

        //
        setSize(400,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class bill extends JFrame{

}