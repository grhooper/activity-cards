package org.example.carddeck;

public class Card {

    private Suit suit;
    private FaceValue value;

    public Card(Suit suit) {
        this.suit = suit;
    }

    public Card(Object suit, Object faceValue) {
    }
}
