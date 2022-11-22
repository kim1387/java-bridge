package bridge.validator;

import bridge.exception.CantBlankOrNullInputException;

import java.util.Objects;

public class CommonValidator {


    public static void validateBlank(final String input) {
        if (isBlank(input)) {
            throw new CantBlankOrNullInputException();
        }
    }

    private static boolean isBlank(String input) {
        return Objects.isNull(input) || input.isEmpty();
    }
}
