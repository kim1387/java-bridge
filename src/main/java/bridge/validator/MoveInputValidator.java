package bridge.validator;

import bridge.exception.RetryInputOnlyQOrRException;

public class MoveInputValidator extends CommonValidator {

    public static void validate(String input) {
        validateBlank(input);
        validateIsUpOrDown(input);
    }

    private static void validateIsUpOrDown(String input) {
        if (isUOrD(input)) {
            throw new RetryInputOnlyQOrRException();
        }
    }

    private static boolean isUOrD(String input) {
        return !(input.equals("U") || input.equals("D"));
    }



}
