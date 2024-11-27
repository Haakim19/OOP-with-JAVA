package uikit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppUI extends JFrame implements ActionListener{
    private JLabel lblnum1,lblnum2,lbltotal;
    private JButton btnAdd,btnReset;
    private JTextField txtnum1,txtnum2,txttotal;
    public AppUI(){
        //Creating components
        lblnum1 = new JLabel("Number 1");
        lblnum2 = new JLabel("Number 2");
        lbltotal = new JLabel("Total");
        btnAdd = new JButton("Add");
        btnReset = new JButton("Reset");
        txtnum1 = new JTextField(10);
        txtnum2 = new JTextField(10);
        txttotal = new JTextField(10);

        //creating the container
        Container mainScreen = this.getContentPane();
        mainScreen.setLayout(new GridLayout(4,2));
        mainScreen.add(lblnum1);
        mainScreen.add(txtnum1);
        mainScreen.add(lblnum2);
        mainScreen.add(txtnum2);
        mainScreen.add(lbltotal);
        mainScreen.add(txttotal);
        mainScreen.add(btnAdd);
        mainScreen.add(btnReset);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(mainScreen, "hi");
            }
        });
        // btnAdd.addActionListener(this);
        btnReset.addActionListener(this);
        setSize(400,200);//set the size of the screen
        setVisible(true);//set secreen to be visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set the default close operation to exit the screen
        //(without this the screen will not close)

    }
    public static void main(String[] args) {
        AppUI appui = new AppUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Hello");
    }
}
