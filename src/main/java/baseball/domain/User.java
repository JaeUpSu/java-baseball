package baseball.domain;

import java.util.List;

public class User {

    private final List<Integer> user;

    User(List<Integer> user) {
        this.user = user;
    }

    public int getNumber(int index) {
        return user.get(index);
    }
}
