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
public class GameTest {
    
    public GameTest() {
    }

    /**
     * Test of getGameName method, of class Game.
     */
    @Test
    public void testGetGameName() {
        System.out.println("getGameName");
        Game instance = null;
        String expResult = "";
        String result = instance.getGameName();
        assertEquals(expResult, result);
                                                                                                        
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = null;
        Game instance = null;
        instance.setPlayers(players);
       
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Game instance = null;
        instance.play();
        
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Game instance = null;
        instance.declareWinner();
        
    }

    /**
     * Test of getTotalScore method, of class Game.
     */
    @Test
    public void testGetTotalScore() {
        System.out.println("getTotalScore");
        Game instance = null;
        int expResult = 0;
        int result = instance.getTotalScore();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDeckInHand method, of class Game.
     */
    @Test
    public void testGetDeckInHand() {
        System.out.println("getDeckInHand");
        Game instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getDeckInHand();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addPoint method, of class Game.
     */
    @Test
    public void testAddPoint() {
        System.out.println("addPoint");
        Game instance = null;
        instance.addPoint();
        
    }

    /**
     * Test of pair method, of class Game.
     */
    @Test
    public void testPair() {
        System.out.println("pair");
        Game instance = null;
        instance.pair();
        
    }

    /**
     * Test of pickUpCard method, of class Game.
     */
    @Test
    public void testPickUpCard() {
        System.out.println("pickUpCard");
        Game instance = null;
        instance.pickUpCard();
        
    }

    /**
     * Test of dealCards method, of class Game.
     */
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        Game instance = null;
        Card expResult = null;
        Card result = instance.dealCards();
        assertEquals(expResult, result);
        
    }

    public class GameImpl extends Game {

        public GameImpl() {
            super("");
        }

        public void play() {
        }

        public void declareWinner() {
        }
    }
    
}
