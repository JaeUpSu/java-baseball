package baseball.validate;

import baseball.domain.Range;
import baseball.exception.InvalidRangeException;

public class ValidateRange {
    public static void validate(Integer number) {
        Range rangeStart = Range.START;
        Range rangeEnd = Range.END;

        if (rangeStart.getNumber() <= number
                && rangeEnd.getNumber() >= number) {
            return;
        }
        throw new InvalidRangeException();
    }
}
