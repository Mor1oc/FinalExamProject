package last.exam.projectnobsguid.exception;

public enum ErrorMessages {
    ProductNotFound("Товар не найден");

    private final String tittle;

    ErrorMessages(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }
}
