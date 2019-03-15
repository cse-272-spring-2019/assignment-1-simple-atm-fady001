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

public class withdraw extends JFrame{
    // customer c = new customerI(900, "0");
    JButton button1= new JButton("withdraw");
//    static String []history=new String[100];
    //history.add("withdraw"+amount);
    
    /**
     *
     */
   public double balance;


        JLabel label = new JLabel("sharaft");
            JTextField txt = new JTextField(50);


    ATMAPP M;
    
    public withdraw(customer c) {
        this.balance = 0;
setLayout(null);

  add (button1);
button1.setBounds(130, 130, 120, 30);
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                withdraw.this.balance = 0;
                //JTextField txt = new JTextField(50);
                if(Double.parseDouble(txt.getText())>c.getBalance()){
                    JOptionPane.showMessageDialog(null, "unsufficient ammount");
                }
                
                else  {
                    JOptionPane.showMessageDialog(null, "done");
                    c.setBalance(c.getBalance()-Double.parseDouble(txt.getText()));
                    mainpage.history[mainpage.i]=("you withdrawed by"+Double.parseDouble(txt.getText()));
                    System.out.println(mainpage.history[mainpage.i]);
                    mainpage.i++;
                    double y= Double.parseDouble(txt.getText());
                }
            }
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
    }}        