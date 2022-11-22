package bridge.domain;

import bridge.exception.NotFoundMoveEnumException;

import java.util.Arrays;

public enum Move {
    U("U", 1),
    D("D", 0);

    private final String message;
    private final Integer alias;

    Move(String message, Integer alias) {
        this.message = message;
        this.alias = alias;
    }

    public String getMessage() {
        return message;
    }

    public Integer getAlias() {
        return alias;
    }

    public static String findMove(Integer alias) {
        return Arrays.stream(values())
                .filter(playerMove -> playerMove.alias.equals(alias))
                .findFirst()
                .map(Move::getMessage)
                .orElseThrow(NotFoundMoveEnumException::new);
    }
}
