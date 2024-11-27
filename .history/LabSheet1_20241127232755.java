
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class LabSheet1 extends JFrame implements ActionListener
{
    private JLabel lblGuesttype,lblRoomtype,lblNoofdaysused,lblTotal;
    private JTextField txtGuesttype,txtRoomtype,txtNoofdaysused,txtTotal;
    private JButton btnSubmit, btnReset;
    
    public LabSheet1()
    {
      lblGuesttype = new JLabel("Guest type");
      lblRoomtype = new JLabel("Room type");
      lblNoofdaysused = new JLabel("No of days used");
      
      txtGuesttype = new JTextField(10);
      txtRoomtype = new JTextField(10);
      txtNoofdaysused = new JTextField(10);
      txtTotal = new JTextField(10);
      
      btnSubmit = new JButton("Submit");
      btnReset = new JButton("Reset");        
      
        Container mainScreen = this.getContentPane();
        mainScreen.setLayout(new GridLayout (4,2));
        mainScreen.add (lblGuesttype);
        mainScreen.add (txtGuesttype);
        mainScreen.add (lblRoomtype);
        mainScreen.add (txtRoomtype);
        mainScreen.add (lblTotal);
        mainScreen.add (txtTotal);
        mainScreen.add (btnSubmit);
        mainScreen.add (btnReset);
        
        
        
        setSize (400,200);
        setVisible (true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main (String[] args){ 
      LabSheet1 labsheet = new LabSheet1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        double Guesttype = 0, Roomtype = 0, Noofdaysused = 0 , total  = 0;
        if(e.getSource () == btnSubmit){
              Guesttype= Double.parseDouble(txtGuesttype.getText());
              Roomtype= Double.parseDouble(txtRoomtype.getText());
              Noofdaysused= Double.parseDouble(txtNoofdaysused.getText());
              txtTotal.setText(""+total);
            }
        else if (e.getSource () == btnReset)
          {
              txtGuesttype.setText("");
              txtRoomtype.setText("");
              txtNoofdaysused.setText("");
              txtTotal.setText("");
          }
    }
} {
    
}
