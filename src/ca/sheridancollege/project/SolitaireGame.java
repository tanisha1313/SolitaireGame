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
public class SolitaireGame extends Game 
{
    private DeckOfCards deck;
    private ArrayList<Pile> piles;

    public SolitaireGame(String givenName) 
    {
        super(givenName);
        deck = new DeckOfCards(52); // Standard deck size
        piles = new ArrayList<>();
        initializePiles();
    }

    private void initializePiles() 
    {
        // Initialize piles (e.g., tableau piles, foundation piles)
        // You can create different types of piles based on Solitaire rules
        for (int i = 0; i < 7; i++) {
            Pile pile = new Pile(52); // Example: 52 is the max size for now
            for (int j = 0; j <= i; j++) {
                pile.showCards().add(deck.drawCard());
            }
            piles.add(pile);
        }
    }

    @Override
    public void play() 
    {
        // Implement the game play logic
        // Example: deal cards, make moves, check for win conditions
        System.out.println("Playing Solitaire...");
        showPiles();
    }

    @Override
    public void declareWinner() 
    {
        // Implement the logic to declare a winner
        // Example: check if the game is won, declare the result
        System.out.println("Winner declared for Solitaire!");
    }

    public DeckOfCards getDeck() 
    {
        return deck;
    }

    public ArrayList<Pile> getPiles() 
    {
        return piles;
    }

    public void setPiles(ArrayList<Pile> piles) 
    {
        this.piles = piles;
    }

    public void showPiles() 
    {
        for (int i = 0; i < piles.size(); i++) {
            System.out.println("Pile " + (i + 1) + ": " + piles.get(i).showCards());
        }
    }
}