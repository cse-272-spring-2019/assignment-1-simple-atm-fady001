/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author doooo
 */
public class Mygui extends JFrame {

    JButton button1 = new JButton("login");
    JLabel label = new JLabel("cardnum");
    JTextField txt = new JTextField(50);
    customer c = new customer(0, "1999");
    JPanel verifyPanel = new JPanel();

    public Mygui() {
        setLayout(null);
        add(label);
        label.setBounds(40, 60, 120, 50);
        add(txt);
        txt.setBounds(130, 60, 120, 30);
        add(button1);
        button1.setBounds(130, 90, 120, 30);
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (txt.getText().equals(c.getcardnum())) {
                    mainpage m = new mainpage(c);
                    //jframe.setstate(Frame.NORMAL);
                    m.setVisible(true);
                    //JFrame.(MAXIMIZED_BOTH);
                    m.setSize(600, 800);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "wrong cardnum");
                }
            }
        });  
}
}