public enum Discount {
    VIP(0.20),
    SECOND_VISIT(0.10),
    NONE(0);
    private double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
    public static Discount getParsedDiscount(String discount){
        switch (discount){
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException();
        }
    }
}

