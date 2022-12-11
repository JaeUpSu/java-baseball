package baseball.exception;

public class InvalidRangeException extends IllegalArgumentException{
    private static final String ERROR_MESSAGE = "[ERROR] 1부터 9사이 숫자만 입력해주세요.";

    public InvalidRangeException() {
        super(ERROR_MESSAGE);
    }
}
