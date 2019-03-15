/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpage;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mygui.ATMAPP;
import mygui.customer;
import mygui.mainpage;

/**
 *
 * @author doooo
 */

public class deposit2 extends JFrame{
    //static String []history=new String[100];
   // static int i=0;
 
  JButton button1= new JButton("deposit");
    //    public float balance=0;

//JButton balance= new JButton("balance");
    //JButton button2= new JButton("deposit");
    //JButton button3= new JButton("previous");
    //JButton button4= new JButton("next");

        JLabel label = new JLabel("sharaft");
                JTextField txt = new JTextField(50);

    ATMAPP M;
    
    public deposit2(customer c) {
      //  this.balance = 0;

        setLayout(null);
  add (button1);
button1.setBounds(130, 130, 120, 30);
        button1.addActionListener((ActionEvent e) -> {
                       double x= Double.parseDouble(txt.getText());
    mainpage.history[mainpage.i]=("you deposited by"+x);      
    System.out.println(mainpage.history[mainpage.i]);
   mainpage.i++;    
    c.setBalance(c.getBalance()+Double.parseDouble(txt.getText()));
           JOptionPane.showMessageDialog(null, "done");
        
        });
add(txt);
  txt.setBounds(130, 60, 120, 30);
JFrame jFrame = new JFrame();
                    JButton button6= new JButton("back");
                    add(button6);
                    button6.setBounds(180, 170, 120, 30);
                    button6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                mainpage m = new mainpage(c);
                JFrame jFrame = new JFrame();
                m.setVisible(true);
                m.setSize(600, 800);

                JFrame jFrame1 = new JFrame();
            }
        });
          
    
    }
}