package CardsWithPower;

public class Card {
    private CardsSuits cardsSuit;
    private CardRanks cardRank;
    private int power;

    public Card (CardsSuits cardsSuit, CardRanks cardRank){
        this.cardsSuit = cardsSuit;
        this.cardRank = cardRank;
    }
    public int getPower() {
        return this.cardsSuit.getSuitPower() + this.cardRank.getPowerRank();
    }

    public CardsSuits getCardsSuit() {
        return cardsSuit;
    }

    public CardRanks getCardRank() {
        return cardRank;
    }
}
