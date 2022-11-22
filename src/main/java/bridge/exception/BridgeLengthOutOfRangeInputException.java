package bridge.exception;

import bridge.config.ErrorCode;

public class BridgeLengthOutOfRangeInputException extends IllegalArgumentException{
    public BridgeLengthOutOfRangeInputException() {
        super(ErrorCode.BRIDGE_LENGTH_OUT_OF_RANGE.getMessage());
    }
}
