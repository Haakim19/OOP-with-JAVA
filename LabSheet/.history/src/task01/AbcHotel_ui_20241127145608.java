package task01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class AbcHotel_ui  extends JFrame{
    private JLabel lblRoomType,lblGuestType,lblNumbberFoDats;
    private JButton btnSubmit;
    public AbcHotel_ui(){
        lblRoomType = new JLabel("RoomType");
        lblGuestType = new JLabel("Guest Type");

        setSize(400,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
