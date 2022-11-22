package bridge.exception;

import bridge.config.ErrorCode;

public class NotFoundMoveEnumException extends IllegalArgumentException{
    public NotFoundMoveEnumException() {
        super(ErrorCode.NOT_FOUND_MOVE_ENUM.getMessage());
    }
}
