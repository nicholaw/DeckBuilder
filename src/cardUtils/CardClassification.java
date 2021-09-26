package cardUtils;

/**
 * Represents the classification of a given card (e.g. Copper is a treasure card)
 */
public enum CardClassification {
    ACTION("Action", true),
    ACTION_ATTACK("Action-Attack", true),
    ACTION_REACTION("Action-Reaction", true),
    TREASURE("Treasure", false),
    VICTORY("Victory", true);

    private String classification;  //The name of this classification
    private boolean isKingdomCard;  //Denotes if this card is a kingdom card

    CardClassification(String classification, boolean isKingdomCard) {
        this.classification = classification;
        this.isKingdomCard = isKingdomCard;
    }

    /**
     * Returns true if this card is a kingdom card (i.e. can be purchased during a player's 'buy' phase
     * and ends the game if it is one of the three exhausted piles on the board) and false otherwise.
     * @return -whether this is a kingdom card
     */
    public boolean getIsKingdomCard() {
        return isKingdomCard;
    }

    @Override
    public String toString() {
        return classification;
    }
}