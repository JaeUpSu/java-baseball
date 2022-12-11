package baseball.domain;

public enum GameCommand {
    START("1"),
    EXIT("2");

    private final String code;

    GameCommand(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
