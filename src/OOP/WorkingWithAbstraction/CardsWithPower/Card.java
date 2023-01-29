package OOP.WorkingWithAbstraction.CardsWithPower;

public class Card {

    private Rank rank;
    private Suit suit;

    private int power;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        calculatePower();
    }

    private void calculatePower() {
        this.power = suit.getPower() +rank.getPower();

    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getPower() {
        return power;
    }
}
