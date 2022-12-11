package baseball.validate;


import baseball.domain.Range;
import baseball.exception.InvalidSizeException;

public class ValidateSize {
    public static void validate(String inputValue) {
        Range size = Range.SIZE;

        if (inputValue.length() == size.getNumber()) {
            return;
        }
        throw new InvalidSizeException();
    }
}
