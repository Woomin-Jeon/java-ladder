package ladder.view;

import ladder.domain.Line;
import ladder.domain.Users;

import java.util.List;
import java.util.Map;

public class Output {
    public static void showUserNames(Users users) {
        System.out.println(users.toString());
    }

    public static void showResult(List<Line> bridgeStates) {
        bridgeStates.forEach(v -> System.out.println(v.toString()));
    }

    public static void showWinners(Map<String, Integer> winners) {
        System.out.println("");
        winners.forEach((key, value) -> {
            if (value == 0) {
                System.out.printf("%s: %s\n", key, "꽝");
            }
            System.out.printf("%s: %d\n", key, value);
        });
    }

    public static void showExpecting(String data) {
        System.out.println(data);
    }
}
