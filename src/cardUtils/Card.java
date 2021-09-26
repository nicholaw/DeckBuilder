package cardUtils;

public class Card {
    private String id;
    private String title;
    private String text;
    private CardClassification type;
    private int cost;
    private int value;
    private int victoryPoints;

    public Card(int value) {
        this.value = value;
    }

    public static Card of(int value) {
        return new Card(value);
    }

    @Override
    public String toString() {
        return value + "\t";
    }
}
