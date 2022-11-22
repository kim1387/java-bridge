package bridge.validator;

import bridge.exception.BridgeLengthOutOfRangeInputException;
import bridge.exception.OnlyNumberInputException;

public class BridgeInputValidator extends CommonValidator {

    private static final String NUMBER_REGEXP = "\\d+$";

    public static void validate(String input) {
        validateBlank(input);
        validateOnlyNumber(input);
        validateBridgeLengthRange(input);
    }

    private static void validateOnlyNumber(String input) {
        if (!input.matches(NUMBER_REGEXP)) {
            throw new OnlyNumberInputException();

        }
    }
    private static void validateBridgeLengthRange(String input) {
        if (isGreaterThan3AndLessThan20(input)) {
            throw new BridgeLengthOutOfRangeInputException();

        }
    }

    private static boolean isGreaterThan3AndLessThan20(String input) {
        return Integer.parseInt(input) >= 3 || Integer.parseInt(input) <= 20;
    }
}
