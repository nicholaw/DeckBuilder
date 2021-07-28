package cardUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Pack {
    private LinkedList<Card> cards;

    /**
     * Constructs a new pack without any cards.
     */
    public Pack() {
        cards = new LinkedList<>();
    }//constructor

    /**
     * Constructs a new pack that contains the provided cards.
     * @param cards the cards to put in the pack
     */
    public Pack(Collection<Card> cards) {
        this.cards = new LinkedList<>(cards);
    }//constructor

    /**
     * Moves the cards from the given pack to the tail of this pack.
     * @param pack the pack to append
     */
    public void appendPack(Pack pack) {
        while (!(pack.isEmpty())) {
            this.offer(pack.pop());
        }
    }//appendPack

    /**
     * Returns the collection of cards contained in this pack.
     * @return the cards in this pack
     */
    public Collection<Card> getCards() {
        return cards;
    }//getCards

    /**
     * Returns true if the number of cards in this pack is zero
     * and false otherwise.
     * @return -whether this pack contains any cards
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }//isEmpty

    /**
     * Returns a new pack containing the provided collection of cards.
     * @param cards -the cards to put in the new pack
     * @return the new pack
     */
    public static Pack of(Collection<Card> cards) {
        return new Pack(cards);
    }//of

    /**
     * Returns the head card in this pack without removing it
     * from the pack.
     * @return the head card in the pack
     */
    public Card peek() {
        return cards.peek();
    }//peek

    /**
     * Removes and returns the head card in this pack.
     * @return the head card in the pack
     */
    public Card pop() {
        return cards.pollFirst();
    }//pop

    /**
     * Adds the provided card to the head of this pack.
     * @param card the card to add
     */
    public void push(Card card) {
        cards.push(card);
    }//push


    /**
     * Adds the provided card to the tail of this pack.
     * @param card the card to add
     */
    public void offer(Card card) {
        cards.offer(card);
    }//offer

    /**
     * Prints each of the cards in this pack.
     */
    public void printPack() {
        System.out.print("[\t");
        for(Card card : cards) {
            System.out.print(card);
        }
        System.out.println("]");
    }//printPack

    /**
     * Prints each of the cards in the provided collection of cards.
     * @param pack the collection of cards to print
     */
    public static void printPack(Collection<Card> pack) {
        System.out.print("[\t");
        pack.stream()
                .forEach(System.out::print);
        System.out.println("]");
    }//printPack

    /**
     * Removes the given card from this pack. Returns true if the given
     * card was successfully removed and false otherwise.
     * @param card the card to be removed
     * @return -whether the card was successfully removed
     */
    public boolean remove(Card card) {
        return cards.remove(card);
    }//remove

    /**
     * Permutes the cards in this pack.
     */
    public void shuffle() {
        Card[] pack = new Card[cards.size()];
        cards.toArray(pack);
        Card tempCard;
        int tempIndex;
        Random rand = new Random(System.currentTimeMillis());
        for(int i = 0; i < pack.length; i++) {
            tempIndex = rand.nextInt(pack.length);
            tempCard = pack[tempIndex];
            pack[tempIndex] = pack[i];
            pack[i] = tempCard;
        }
        cards = new LinkedList<>();
        Arrays.stream(pack).forEach(c -> cards.add(c));
    }//shuffle
}//Pack
