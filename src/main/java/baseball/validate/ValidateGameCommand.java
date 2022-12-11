package baseball.validate;

import baseball.domain.GameCommand;
import baseball.exception.InvalidGameCommandException;

public class ValidateGameCommand {

    public static void validate(String code) {
        GameCommand start = GameCommand.START;
        GameCommand exit = GameCommand.EXIT;

        if(start.getCode().equals(code) || exit.getCode().equals(code)) {
            return;
        }
        throw new InvalidGameCommandException();
    }
}
