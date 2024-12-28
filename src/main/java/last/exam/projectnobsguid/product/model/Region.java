package last.exam.projectnobsguid.product.model;

public enum Region {
    US("US"),
    CAN("CAN"),
    BY("BY"),
    RU("RU");

    private final String tittle;

    Region(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public static Region fromString(String string) {
        return switch (string) {
            case "US" -> Region.US;
            case "CAN" -> Region.CAN;
            case "BY" -> Region.BY;
            case "RU" -> Region.RU;
            default -> null;
        };
    }
}
