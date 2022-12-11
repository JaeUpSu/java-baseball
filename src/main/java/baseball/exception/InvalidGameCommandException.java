package baseball.exception;

public class InvalidGameCommandException extends IllegalArgumentException{
    private static final String ERROR_MESSAGE = "[ERROR] 허용된 게임 명령어를 입력해주세요.(1: 재시작, 2: 종료)";

    public InvalidGameCommandException() {
        super(ERROR_MESSAGE);
    }
}
