package baseball.view;

import baseball.validate.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String READ_NUMBERS = "숫자를 입력해주세요 : ";
    private static final String READ_COMMAND = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n";

    private final InputValidator inputValidator = new InputValidator();

    public int readNumbers() {
        String inputNumbers = Console.readLine();
        System.out.println(READ_NUMBERS + inputNumbers);
        inputValidator.validateReadNumbers(inputNumbers);
        return Integer.parseInt(inputNumbers);
    }

    public String readCommand() {
        String inputCommand = Console.readLine();
        System.out.println(READ_COMMAND + inputCommand);
        inputValidator.validateReadCommand(inputCommand);
        return inputCommand;
    }
}
