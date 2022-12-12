package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Integer> computer;

    Computer(List<Integer> computer) {
        this.computer = computer;
    }

    public int getNumber(int index) {
        return computer.get(index);
    }
}
