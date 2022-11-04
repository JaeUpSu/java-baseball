package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application {

    private static final int SIZE = 3;

    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }

    private static void playGame() {

    }

    private static List<Integer> getTargetNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    // print 로 바꾸기
    private static void printBallStrike(int ballCount, int strikeCount) throws IOException {

        int nothing = 0;

        if (ballCount > nothing && strikeCount > nothing) {
            System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
        } else if (ballCount > nothing) {
            System.out.println(ballCount + "볼");
        } else if (strikeCount > nothing) {
            System.out.println(strikeCount + "스트라이크");
            checkSuccess(strikeCount);
        } else if (ballCount == nothing && strikeCount == nothing) {
            System.out.println("낫싱");
        }

        return;
    }

    private static void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        return;
    }

    private static void checkSuccess(int strikeCount) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if (strikeCount == SIZE) {
            System.out.println(SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
            int toBeContinue = Integer.valueOf(br.readLine());
            checkAgainGame(toBeContinue);
        }

        return;
    }

    private static void checkAgainGame(int toBeContinue) {

        int againGame = 1;
        int exitGame = 2;

        if (toBeContinue == againGame) {
            playGame();
        } else if (toBeContinue == exitGame) {
            // 게임 종료
        }
    }
}