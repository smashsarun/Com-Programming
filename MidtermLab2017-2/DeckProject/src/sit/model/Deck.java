package sit.model;

public class Deck {

    private int size;
    private Card cards[];

    public Deck() {
        cards = new Card[52];
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                cards[a] = new Card (j,i);
                a++;
            }
        }
        size = 52;
    
    }

    /**
     * Return the number of Cards currently in the Deck.
     */
    public int size() {
        return size;
    }

    /**
     * Remove one Card from the Deck and return it.
     */
    public Card deal() {
        size--;
        return cards[size];
    }

    /**
     * Return true if the Deck contains no Cards.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        String cardInDecks = "";
        for (Card c : cards) {
            cardInDecks += c + "\n";
        }
        return cardInDecks;
    }

    /**
     * Randomly rearrange the Cards in the Deck.
     */
    public void shuffle() {
        int random1 = (int)(Math.random()*10+1);
        int random2 = (int)(Math.random()*52);
        int random3 = (int)(Math.random()*52);
        Card newCard[] = new Card[52];
        
        for (int i = 0; i < newCard.length-random1; i++) {
            newCard[i] = this.cards[i+random1];
        }
        
        for (int j = newCard.length-random1+1; j < newCard.length; j++) {
            newCard[j] = this.cards[j-2];
        }
        this.cards = newCard;
        swap(random2,random3);
    }

    /**
     * Swap the Cards at indices i and j.
     */
    public void swap(int i, int j) {
        Card temp1 = this.cards[i];
        Card temp2 = this.cards[j];
        this.cards[i] = temp2;
        this.cards[j] = temp1;
        
    }

    public Card getMaxCard() { 
        Card maxCard = null;
        
        for (int i = 0; i < size; i++) {
            if (cards[i].getSuit() >= cards[i+1].getSuit()) {
                maxCard = cards[i];
                
            }
            else{
                if (cards[i].getRank() >= cards[i+1].getRank() ) {
                    maxCard = cards[i];
                }
            }
        }
        return maxCard;
    }

}
