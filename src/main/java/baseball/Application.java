package baseball;

public class Application {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        printStart();
        Game computer = new Game();
        Game.play(computer);
    }

    private static void printStart() {
        System.out.println(START_MESSAGE);
    }
}
