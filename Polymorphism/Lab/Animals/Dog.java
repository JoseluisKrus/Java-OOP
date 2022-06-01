public class Dog extends Animal{
    protected Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%nDJAAF", super.explainSelf());
    }
}
