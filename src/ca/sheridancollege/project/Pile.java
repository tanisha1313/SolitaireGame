/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author tanis
 */
public class Pile extends GroupOfCards {
    public Pile(int givenSize) {
        super(givenSize);
    }

    public void addCard(Card card) {
        if (showCards().size() < getSize()) {
            showCards().add(card);
        }
    }

    public Card removeCard() {
        if (!showCards().isEmpty()) {
            return showCards().remove(showCards().size() - 1);
        } else {
            return null; // No cards left to remove
        }
    }
}
