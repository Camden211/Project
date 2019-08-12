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
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerID() {
        System.out.println("getPlayerID");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerID() {
        System.out.println("setPlayerID");
        String givenID = "";
        Player instance = null;
        instance.setPlayerID(givenID);
        
    }

    /**
     * Test of play method, of class Player.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Player instance = null;
        instance.play();
       
    }

    /**
     * Test of turn method, of class Player.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        Player instance = null;
        instance.turn();
       
    }

    public class PlayerImpl extends Player {

        public PlayerImpl() {
            super("");
        }

        public void play() {
        }

        public void turn() {
        }
    }
    
}
