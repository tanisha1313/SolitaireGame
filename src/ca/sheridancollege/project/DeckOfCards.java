/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;


/**
 *
 * @author tanis
 */
public class DeckOfCards extends GroupOfCards{
    public DeckOfCards(int givenSize)
    {
        super(givenSize);
        initializeDeck();
    }

    private void initializeDeck()
    {
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new StandardCard(value, suit));
            }
        }
        shuffle();
    }

    public Card drawCard()
    {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }
}

class StandardCard extends Card 
{
    private final String value;
    private final String suit;

    public StandardCard(String value, String suit)
    {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() 
    {
        return value + " of " + suit;
    }
}