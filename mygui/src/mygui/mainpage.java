/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mainpage.Balance;
import mainpage.deposit;
import mainpage.deposit2;
import mainpage.withdraw;

/**
 *
 * @author doooo
 */


public class mainpage extends JFrame{
    JButton button1= new JButton("withdraw");
        JButton balance= new JButton("balance inquiry");
    JButton button2= new JButton("deposit");
    JButton button3= new JButton("previous");
    JButton button4= new JButton("next");
  public static String []history=new String[5];
public  static int i;
        JLabel label = new JLabel("sharaft");
                        JLabel label2 = new JLabel("helloooooo");
                        
   // JLabel label2 = new JLabel(history[i]);

        ATMAPP M;

  public mainpage (customer c){
      setLayout(null);
  add (button1);
button1.setBounds(130, 130, 120, 30);
button1.addActionListener((ActionEvent e) -> {
               withdraw m = new withdraw(c);
    
          JFrame jFrame = new JFrame();
            m.setVisible(true);
                          m.setSize(600, 500);

              JFrame jFrame1 = new JFrame();

            JLabel label = new JLabel("sharaft");
        JTextField txt = new JTextField(50);
        
   
    add(label);
        label.setBounds(40, 60, 120, 50);
                   

//add(txt);
        //txt.setBounds(130, 60, 120, 30);
 //JButton button6= new JButton("done");
 //add(button6);
//button6.setBounds(180, 170, 120, 30);

      });
 add(button2);
button2.setBounds(130, 170, 120, 30);
button2.addActionListener((ActionEvent e) -> {
           deposit2 m = new deposit2(c);
               //m.setVisible(false);
          JFrame jFrame = new JFrame();
            m.setVisible(true);
              m.setSize(600, 500);

              JFrame jFrame1 = new JFrame();

            JLabel label = new JLabel("sharaft");
        JTextField txt = new JTextField(50);
   
    add(label);
        label.setBounds(40, 60, 120, 50);
        

      });  
  add(label2);
        label2.setBounds(300, 100, 350, 50);
      
add (button3);
button3.setBounds(30, 260, 120, 30);
  button3.addActionListener((ActionEvent e) -> {
                    
          int i = 0;
   //JOptionPane.showMessageDialog(null, "history[i]");
label2.setText(history[i]);
  });

JFrame jFrame3 = new JFrame();
  
      
      add (button4);
button4.setBounds(240, 260, 120, 30);
    button4.addActionListener((ActionEvent e) -> {
    
    });
add (balance);
balance.setBounds(130, 210, 120, 30);
  balance.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent e) {
              Balance m = new Balance(c);
              m.setVisible(false);
              JFrame jFrame = new JFrame();
              m.setVisible(true);
              m.setSize(600, 500);
              
              JFrame jFrame3 = new JFrame();
              JLabel label1 = new JLabel("sharaft");
              JTextField txt = new JTextField(50);
              add(label1);
              label1.setBounds(40, 60, 120, 50);
          }
      });






}}
