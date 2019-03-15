/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpage;
import java.awt.Button;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.JPanel;
import mygui.ATMAPP;
import mygui.customer;
import mygui.mainpage;


/**
 *
 * @author doooo
 */
public class Balance extends JFrame{

    //JTextField txt = new JTextField(50);
    //JPanel vertifyPanel = new JPanel();

    ATMAPP M;
    
    public Balance(customer c) {
        String fadi=new String();
        fadi="your balance equals: ";
    JLabel label = new JLabel(fadi+String.valueOf(c.getBalance()));
    add(label);
        label.setBounds(90, 1000, 120, 50);
JFrame jFrame3 = new JFrame();
    // JLabel label = new JLabel("balance");

    }}