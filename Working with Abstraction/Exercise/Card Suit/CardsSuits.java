package CardsSuits;

public enum CardsSuits {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);
    private int value;

    CardsSuits(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
