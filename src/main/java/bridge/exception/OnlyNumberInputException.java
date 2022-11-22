package bridge.exception;

import bridge.config.ErrorCode;

public class OnlyNumberInputException extends IllegalArgumentException {
    public OnlyNumberInputException() {
        super(ErrorCode.ONLY_NUMBER.getMessage());
    }
}
