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
public class deposit extends JFrame{
 JButton button1= new JButton("deposit");
 
        //JButton balance= new JButton("balance");
    //JButton button2= new JButton("deposit");
    //JButton button3= new JButton("previous");
    //JButton button4= new JButton("next");

        JLabel label = new JLabel("sharaft");
                JTextField txt = new JTextField(50);

    ATMAPP M;
    
    public deposit(customer c) {
setLayout(null);
  add (button1);
button1.setBounds(130, 130, 120, 30);
button1.addActionListener((ActionEvent e) -> {
           String num=txt.getText();
    System.out.println(num);

      });  
add(txt);
  txt.setBounds(130, 60, 120, 30);
JFrame jFrame = new JFrame();
            JButton button7= new JButton("sharaft");
 add(button7);
button7.setBounds(180, 170, 120, 30);
        
    }
    
















}
    

