class Card {
    String suit;
    String rank;
    int rankValue;

    Card(String suit, String rank, int rankValue) {
        this.suit = suit;
        this.rank = rank;
        this.rankValue = rankValue;
    }
    public String toString() { return rank + " of " + suit; }
}

class Node {
    Object data;
    Node next;
    Node(Object data) { this.data = data; }
}

class CustomQueue {
    Node head, tail;
    void enqueue(Object data) {
        Node newNode = new Node(data);
        if (tail == null) { head = tail = newNode; return; }
        tail.next = newNode;
        tail = newNode;
    }
}

class Player {
    Card[] hand = new Card[9];
    int count = 0;

    void addCard(Card c) { hand[count++] = c; }

    void sortByRank() {
        for (int i = 0; i < hand.length; i++) {
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].rankValue > hand[j].rankValue) {
                    Card temp = hand[i];
                    hand[i] = hand[j];
                    hand[j] = temp;
                }
            }
        }
    }
}

public class DeckOfCardsExtended {
    public static void main(String[] args) {
        
        CustomQueue playerQueue = new CustomQueue();
        for (int i = 0; i < 4; i++) {
            Player p = new Player();
            // Assign 9 cards to player here...
            p.sortByRank();
            playerQueue.enqueue(p);
        }
    }
}