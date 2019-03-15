/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import java.util.ArrayList;

/**
 *
 * @author doooo
 */

public class customer {
public double balance=0;
private final String cardnum;
public float withdraw;
    //ArrayList<string>history=new arraylist;

public customer (float balance,String cardnum){
this.balance=balance;
this.cardnum=cardnum;

}

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     *
     * @return 
     */
//    public double getbalance(){
//return balance;
//}
//     public void setbalance(double balance){
//this.balance= 0;
//     }
      public String getcardnum(){
return cardnum;
      }

    /**
     *
     * @param cardnum
     */
    public void setcardnum(String cardnum){
           }
         
}

