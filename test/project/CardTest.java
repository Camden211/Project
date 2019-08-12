/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camde
 */
public class CardTest {
    
    public CardTest() {
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getCard method, of class Card.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Card instance = null;
        String expResult = "";
        String result = instance.getCard();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of match method, of class Card.
     */
    @Test
    public void testMatch() {
        System.out.println("match");
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.match();
        assertEquals(expResult, result);
       
    }
    
}
