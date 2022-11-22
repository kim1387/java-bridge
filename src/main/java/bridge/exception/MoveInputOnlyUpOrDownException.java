package bridge.exception;

import bridge.config.ErrorCode;

public class MoveInputOnlyUpOrDownException extends IllegalArgumentException{
    public MoveInputOnlyUpOrDownException() {
        super(ErrorCode.MOVE_ONLY_UP_AND_DOWN.getMessage());
    }
}
