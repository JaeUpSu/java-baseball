package baseball.exception;

public class InvalidSizeException extends IllegalArgumentException{
    private static final String ERROR_MESSAGE = "[ERROR] 숫자를 3개만 입력해주세요.";

    public InvalidSizeException() {
        super(ERROR_MESSAGE);
    }
}
