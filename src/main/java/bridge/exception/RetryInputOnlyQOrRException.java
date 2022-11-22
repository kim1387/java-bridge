package bridge.exception;

import bridge.config.ErrorCode;

public class RetryInputOnlyQOrRException extends IllegalArgumentException{
    public RetryInputOnlyQOrRException() {
        super(ErrorCode.RETRY_INPUT_ONLY_Q_AND_R.getMessage());
    }
}
