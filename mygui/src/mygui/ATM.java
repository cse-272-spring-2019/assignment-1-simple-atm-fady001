/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

/**
 *
 * @author doooo
 */
public class ATM implements ATMAPP {

   client c;
    
    /**
     *
     * @param amount
     */
    @Override
    public void withdraw(String amount) {
    double x = Double.parseDouble(amount);
    if (c.getbalance()>x){
        Double current= c.getbalance();
        c.setbalance(current - x);
    } 
    }
    @Override
    public String balanceinquiry() {
     return c.getbalance()+"";
     
    }
    
}
