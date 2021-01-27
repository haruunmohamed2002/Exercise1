/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author swage
 */
public class Card {
    private int Cardnum;
    private String suit;
    
    public static final String [] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getCardnum() {
        return Cardnum;
    }

    public void setCardnum(int Cardnum) {
        this.Cardnum = Cardnum;
    }


    
}
