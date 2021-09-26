package gameUtils;

import cardUtils.Card;
import cardUtils.Pack;

import java.util.Collection;

/**
 * Represents a player in the game.
 */
public class Player {
    private int id;
    private String name;
    private Pack hand;
    private Pack drawPile;
    private Pack discardPile;

    /**
     * Constructs a player with the given name and id.
     * @param id the id to set
     * @param name the name to set
     */
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        hand = new Pack();
        drawPile = new Pack();
        discardPile = new Pack();
    }

    /**
     * Moves a card from the player's hand to the board's trash pile.
     * @param card the card to be destroyed
     */
    public void destroy(Card card) {
        hand.remove(card);
    }//destroy

    /**
     * Moves a card from the player's hand to the player's
     * discard pile.
     * @param card the card to be discarded
     */
    public void discard(Card card) {
        if(hand.remove(card))
            discardPile.push(card);
    }//discard

    /**
     * Moves a card from the player's draw pile to the player's hand.
     * If the player's draw pile is empty, shuffles the player's
     * discard pile and adds it to the bottom of the player's draw pile.
     */
    public void draw() {
        if(drawPile.isEmpty()) {
            discardPile.shuffle();
            drawPile.appendPack(discardPile);
        }
        hand.offer(drawPile.pop());
    }//draw


    /**
     * Returns the id of this player.
     * @return -the player's id
     */
    public int getId() {
        return id;
    }//getId

    /**
     * Returns the name of the player.
     * @return -the player's name
     */
    public String getName() {
        return name;
    }//getName

    /**
     * Offers all cards of the given collection to the player's
     * draw pile and then shuffles the pile.
     * @param cards the cards to be offered
     */
    public void setDrawPile(Collection<Card> cards) {
        cards.stream().forEach(drawPile::offer);
        drawPile.shuffle();
    }//setDrawPile

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(!(obj instanceof Player))
            return false;
        return id == ((Player)obj).getId();
    }//equals

    @Override
    public String toString() {
        return name + "(P" + id + ")";
    }//toString
}//Player