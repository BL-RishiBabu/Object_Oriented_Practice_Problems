import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = ranks[i % 13] + " of " + suits[i / 13];
        }

        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(52 - i);
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        String[][] players = new String[4][9];
        int cardIdx = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck[cardIdx++];
                System.out.print(players[i][j] + " | ");
            }
            System.out.println();
        }
    }
}