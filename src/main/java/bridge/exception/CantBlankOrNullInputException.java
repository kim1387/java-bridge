package bridge.exception;

import bridge.config.ErrorCode;

public class CantBlankOrNullInputException extends IllegalArgumentException{
    public CantBlankOrNullInputException() {
        super(ErrorCode.CANT_BLANK_OR_NULL_INPUT.getMessage());
    }
}
