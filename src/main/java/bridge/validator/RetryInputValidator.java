package bridge.validator;

import bridge.exception.RetryInputOnlyQOrRException;

public class RetryInputValidator extends CommonValidator {

    private RetryInputValidator() {
    }

    public static void validate(String input) {
        validateBlank(input);
        validateIsROrQ(input);
    }

    private static void validateIsROrQ(String input) {
        if (isQOrR(input)) {
            throw new RetryInputOnlyQOrRException();
        }
    }

    private static boolean isQOrR(String input) {
        return !(input.equals("Q") || input.equals("R"));
    }


}
