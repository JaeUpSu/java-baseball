package baseball.validate;

public class InputValidator {
    public void validateReadNumbers(String inputNumbers) {
        ValidateIsNumber.validate(inputNumbers);
        ValidateSize.validate(inputNumbers);
        int numbers = Integer.valueOf(inputNumbers);
        ValidateRange.validate(numbers);
    }

    public void validateReadCommand(String inputCommand) {
        ValidateGameCommand.validate(inputCommand);
    }
}
