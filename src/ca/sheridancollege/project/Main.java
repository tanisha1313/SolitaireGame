/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author tanis
 */
public class Main {
   public static void main(String[] args) 
    {
        SolitaireGame solitaireGame = new SolitaireGame("Classic Solitaire");
        ArrayList<Player> players = new ArrayList<>();
        players.add(new SolitairePlayer("Player 1"));
        solitaireGame.setPlayers(players);
        solitaireGame.play();
        solitaireGame.declareWinner();
    }
}

class SolitairePlayer extends Player 
{
    public SolitairePlayer(String name) 
    {
        super(name);
    }

    @Override
    public void play() 
    {
        // Implement player-specific play logic
        System.out.println(getPlayerID() + " is playing.");
    } 
}
