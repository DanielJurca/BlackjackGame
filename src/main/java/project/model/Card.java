package project.model;

import java.util.Objects;

/**
 *
 * @author František Holubec
 */
public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    public Suit getSuit() {
        return suit;
    }

    public String toPicture(){
        return new StringBuilder()
                .append(" ___ \n|")
                .append(String.format("%1$-3s", rank.getSymbol()))
                .append("|\n| ").append(suit.getSymbol()).append(" |\n|")
                .append(String.format("%1$3s", rank.getSymbol()).replace(" ", "_"))
                .append("|\n").toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString() {
        return rank + "-" + suit;
    }
}
