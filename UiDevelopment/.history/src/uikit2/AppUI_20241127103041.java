package uikit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class AppUI extends JFrame{
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
        
    }
    public static void main(String[] args) {
        
    }
}
