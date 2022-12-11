package baseball.domain;

public enum Range {
    START(1),
    END(9),
    SIZE(3);

    private final Integer number;

    Range(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
