package bridge.config;

public enum ErrorCode {
    MOVE_ONLY_UP_AND_DOWN("이동 방향은 반드시 U, D로만 입력할 수 있습니다."),
    RETRY_INPUT_ONLY_Q_AND_R("재시도 입력은 반드시 R, Q로만 입력할 수 있습니다."),
    ONLY_NUMBER("정수만 입력할 수 있습니다."),

    BRIDGE_LENGTH_OUT_OF_RANGE("다리의 길이는 3 ~ 20 사이 숫자로만 이루어진 수를 입력할 수 있습니다."),
    CANT_BLANK_OR_NULL_INPUT("null 이나 빈값이 들어올 수 없습니다."),
    ;

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
