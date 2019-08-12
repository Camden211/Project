/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camde
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }

    /**
     * Test of showCards method, of class GroupOfCards.
     */
    @Test
    public void testShowCards() {
        System.out.println("showCards");
        GroupOfCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.showCards();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = null;
        instance.shuffle();
        
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSize method, of class GroupOfCards.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int givenSize = 0;
        GroupOfCards instance = null;
        instance.setSize(givenSize);
       
    }

    /**
     * Test of numberOfCardsLeft method, of class GroupOfCards.
     */
    @Test
    public void testNumberOfCardsLeft() {
        System.out.println("numberOfCardsLeft");
        int numCard = 0;
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.numberOfCardsLeft(numCard);
        assertEquals(expResult, result);
       
    }
    
}
