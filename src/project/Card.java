/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author megha, 2019
 */
public class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    String card; 
    
    public Card(String cards) {
        cards = card;   
}
    @Override
    public String toString(){
     return card;   
    }
    
    public String getCard(){
        return card;
    }
   
    public boolean match(){
        return true;
    }
}
